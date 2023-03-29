package com.bitrekz.bolsta.converters;

import com.bitrekz.bolsta.exceptions.ConversionException;

public interface Converter<SOURCE, TARGET>
{
	TARGET convert(SOURCE var1) throws ConversionException;

	TARGET convert(SOURCE var1, TARGET var2) throws ConversionException;
}

