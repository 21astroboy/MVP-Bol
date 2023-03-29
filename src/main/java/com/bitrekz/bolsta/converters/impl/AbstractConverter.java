package com.bitrekz.bolsta.converters.impl;


import java.lang.reflect.Method;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.ReflectionUtils;

import com.bitrekz.bolsta.converters.Converter;
import com.bitrekz.bolsta.converters.Populator;
import com.bitrekz.bolsta.exceptions.ConversionException;

public abstract class AbstractConverter<SOURCE, TARGET>
        implements Converter<SOURCE, TARGET>, Populator<SOURCE, TARGET>, InitializingBean, BeanNameAware {
    private Class<TARGET> targetClass;

    @Override
    public TARGET convert(final SOURCE source) throws ConversionException {
        final TARGET target = targetClass == null ? createTarget() : createFromClass();
        populate(source, target);
        return target;
    }

    @Override
    public TARGET convert(final SOURCE source, final TARGET prototype) throws ConversionException {
        populate(source, prototype);
        return prototype;
    }

    @Override
    public abstract void populate(final SOURCE source, final TARGET target);

    public void setTargetClass(final Class<TARGET> targetClass) {
        this.targetClass = targetClass;
        if (targetClass != null) {
            createFromClass();
        }
    }

    protected TARGET createFromClass() {
        try {
            return targetClass.newInstance();
        } catch (final InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Deprecated
    protected TARGET createTarget() {
        throw new NotImplementedException();
    }

    private String myBeanName;

    @Override
    public void setBeanName(final String name) {
        this.myBeanName = name;
    }

    public String getMyBeanName() {
        return myBeanName;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (targetClass == null) {
            final Class<? extends AbstractConverter> cl = this.getClass();
            final Method createTargetMethod = ReflectionUtils.findMethod(cl, "createTarget");
            if (AbstractConverter.class.equals(createTargetMethod.getDeclaringClass())) {
                throw new IllegalStateException(
                        "Converter '" + myBeanName + "' doesn't have a targetClass property nor does it override createTarget()!");
            }
        }
    }
}
