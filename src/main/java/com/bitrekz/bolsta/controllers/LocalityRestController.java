package com.bitrekz.bolsta.controllers;

import com.bitrekz.bolsta.model.Locality;
import com.bitrekz.bolsta.services.LocalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class LocalityRestController {

    @Autowired
    private LocalityService localityService;

    @GetMapping(path = "/region/{id}/locs")
    public List<Locality> getRegionLocalities(@PathVariable Long id){
        return localityService.getLocalitiesByRegionId(id);
    }
}
