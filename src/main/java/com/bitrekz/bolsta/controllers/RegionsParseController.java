package com.bitrekz.bolsta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;


@Controller
public class RegionsParseController {

    private static final String SELECT_QUERY = "SELECT * from db_locality LIMIT 100";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping(path = {"/regions"})
    public String mainPage(Model model) {
        List<Map<String, Object>> result = jdbcTemplate.queryForList(SELECT_QUERY);
        result.forEach(row -> {
            System.out.println(row.get("name"));
        });
        return "index";
    }
}
