package com.bitrekz.bolsta.services;

import com.bitrekz.bolsta.model.Region;

import java.util.List;

public interface RegionService {
    List<Region> getAllRegions();
    Region getRegionById(Long id);
}
