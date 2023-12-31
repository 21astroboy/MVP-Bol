package com.bitrekz.bolsta.converters.impl;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bitrekz.bolsta.converters.Populator;
import com.bitrekz.bolsta.converters.PopulatorList;


public class AbstractPopulatingConverter<SOURCE, TARGET> extends AbstractConverter<SOURCE, TARGET> implements
        PopulatorList<SOURCE, TARGET> {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractPopulatingConverter.class);
    private List<Populator<SOURCE, TARGET>> populators;

    @Override
    public List<Populator<SOURCE, TARGET>> getPopulators() {
        return populators;
    }

    @Override
    public void setPopulators(final List<Populator<SOURCE, TARGET>> populators) {
        this.populators = populators;
    }

    @Override
    public void populate(final SOURCE source, final TARGET target) {
        final List<Populator<SOURCE, TARGET>> list = getPopulators();

        if (list == null) {
            return;
        }

        for (final Populator<SOURCE, TARGET> populator : list) {
            if (populator != null) {
                populator.populate(source, target);
            }
        }
    }

    @PostConstruct
    public void removePopulatorsDuplicates() {
        if (CollectionUtils.isNotEmpty(populators)) {
            final LinkedHashSet<Populator<SOURCE, TARGET>> distinctPopulators = new LinkedHashSet<>();

            for (final Populator<SOURCE, TARGET> populator : populators) {
                if (!distinctPopulators.add(populator)) {
                    LOG.warn("Duplicate populator entry [{}] found for converter {}! The duplication has been removed.",
                            populator.getClass().getName(), getMyBeanName());
                }
            }
            this.populators = new ArrayList<>(distinctPopulators);
        } else {
            LOG.warn("Empty populators list found for converter {}!", getMyBeanName());
        }
    }
}
