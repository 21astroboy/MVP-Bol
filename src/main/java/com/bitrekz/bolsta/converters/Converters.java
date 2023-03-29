package com.bitrekz.bolsta.converters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.util.Assert;

public final class Converters {

    private Converters() {
    }

    public static <SOURCE, TARGET> List<TARGET> convertAll(final Collection<? extends SOURCE> sourceList,
                                                           final Converter<SOURCE, TARGET> converter) {
        Assert.notNull(converter);

        if (sourceList == null || sourceList.isEmpty()) {
            return Collections.emptyList();
        }

        final List<TARGET> result = new ArrayList<TARGET>(sourceList.size());

        for (final SOURCE source : sourceList) {
            result.add(converter.convert(source));
        }

        return result;
    }
}
