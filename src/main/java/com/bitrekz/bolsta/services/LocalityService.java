package com.bitrekz.bolsta.services;

import com.bitrekz.bolsta.model.Locality;

import java.util.List;

public interface LocalityService {
    List<Locality> getLocalitiesByRegionId(Long id);
}
