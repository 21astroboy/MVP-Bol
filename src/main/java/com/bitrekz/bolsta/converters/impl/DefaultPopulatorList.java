package com.bitrekz.bolsta.converters.impl;

import java.util.List;

import com.bitrekz.bolsta.converters.Populator;
import com.bitrekz.bolsta.converters.PopulatorList;


public class DefaultPopulatorList<SOURCE, TARGET> implements Populator<SOURCE, TARGET>, PopulatorList<SOURCE, TARGET>
{
	private List<Populator<SOURCE, TARGET>> populators;

	@Override
	public List<Populator<SOURCE, TARGET>> getPopulators()
	{
		return populators;
	}

	@Override
	public void setPopulators(final List<Populator<SOURCE, TARGET>> populators)
	{
		this.populators = populators;
	}

	@Override
	public void populate(final SOURCE source, final TARGET target)
	{
		final List<Populator<SOURCE, TARGET>> list = getPopulators();
		if (list != null)
		{
			for (final Populator<SOURCE, TARGET> populator : list)
			{
				if (populator != null)
				{
					populator.populate(source, target);
				}
			}
		}
	}
}
