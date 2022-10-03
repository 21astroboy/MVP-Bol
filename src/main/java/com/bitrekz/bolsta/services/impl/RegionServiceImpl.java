package com.bitrekz.bolsta.services.impl;

import com.bitrekz.bolsta.model.Region;
import com.bitrekz.bolsta.repo.RegionRepo;
import com.bitrekz.bolsta.services.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionRepo regionRepo;

    @Override
    public List<Region> getAllRegions() {
        return regionRepo.findAll();
    }

    @Override
    public Region getRegionById(Long id) {
        return regionRepo.findById(id).orElse(null);
    }

}
