package com.bitrekz.bolsta.controllers;

import com.bitrekz.bolsta.model.Locality;
import com.bitrekz.bolsta.model.Region;
import com.bitrekz.bolsta.repo.LocalityRepo;
import com.bitrekz.bolsta.repo.RegionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;


@Controller
public class RegionsParseController {

    private static final String SELECT_QUERY = "SELECT * from db_locality LIMIT 100";
    private static final String SELECT_REGION_QUERY = "SELECT * FROM db_locality WHERE level=2 AND owner=481";
    private static final String SELECT_LOCALITY_QUERY = "SELECT * FROM db_locality WHERE level=3 AND owner=";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private RegionRepo regionRepo;

    @Autowired
    private LocalityRepo localityRepo;

    @GetMapping(path = {"/regions"})
    public String mainPage(Model model) {
        List<Map<String, Object>> regions_res = jdbcTemplate.queryForList(SELECT_REGION_QUERY);
        List<Region> regions = new ArrayList<>();
        regions_res.forEach(row -> {
            Region region = new Region();
            region.setName(row.get("name").toString());
            region.setCode(row.get("code").toString());
            List<Map<String, Object>> loc_res = jdbcTemplate.queryForList(SELECT_LOCALITY_QUERY + row.get("id"));
            regionRepo.save(region);
            loc_res.forEach(loc -> {
                Locality locality = new Locality();
                String prefix = loc.get("type").toString().equals("г.") ? "" : loc.get("type").toString() + " ";
                locality.setName(prefix + loc.get("name").toString());
                Region regModel = regionRepo.getReferenceById(regionRepo.findByName(region.getName()).getId());
                locality.setRegion(regModel);
                locality.setTimezone(loc.get("timezone").toString());
                localityRepo.save(locality);
            });
            regions.add(region);
        });

        //model.addAttribute("regions", regionRepo.findAll());
        return "regions";
    }


}
