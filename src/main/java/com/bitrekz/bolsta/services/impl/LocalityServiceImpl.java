package com.bitrekz.bolsta.services.impl;

import com.bitrekz.bolsta.model.Locality;
import com.bitrekz.bolsta.model.Region;
import com.bitrekz.bolsta.repo.LocalityRepo;
import com.bitrekz.bolsta.services.LocalityService;
import com.bitrekz.bolsta.services.RegionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static com.bitrekz.bolsta.constants.ErrorConstants.REGION_NOT_FOUND;

@Service
public class LocalityServiceImpl implements LocalityService {

    private static final Logger LOG = LoggerFactory.getLogger(LocalityServiceImpl.class);

    @Autowired
    private RegionService regionService;

    @Autowired
    private LocalityRepo localityRepo;

    @Override
    public List<Locality> getLocalitiesByRegionId(Long id) {
        Region region = regionService.getRegionById(id);
        if(Objects.isNull(region)){
            LOG.error(REGION_NOT_FOUND, id);
            return Collections.emptyList();
        }
        return localityRepo.findAllByRegion(region);
    }
}
