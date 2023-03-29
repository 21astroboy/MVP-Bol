package com.bitrekz.bolsta.converters;

import com.bitrekz.bolsta.exceptions.ConversionException;

public interface Populator<SOURCE, TARGET>
{
	void populate(SOURCE source, TARGET target) throws ConversionException;
}
