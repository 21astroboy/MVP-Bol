package com.bitrekz.bolsta.controllers;

import com.bitrekz.bolsta.model.Region;
import com.bitrekz.bolsta.model.UserRegistrationDto;
import com.bitrekz.bolsta.repo.RegionRepo;
import com.bitrekz.bolsta.services.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class RegisterController {

    @Autowired
    private RegionService regionService;

    @GetMapping(path = "/register")
    public String registerPage(Model model) {
        model.addAttribute("newUser", new UserRegistrationDto());
        return "register/step1";
    }

    @PostMapping(path = "/register", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String registerProcess(@ModelAttribute(name = "newUser") UserRegistrationDto newUser, Model model) {
        String nextPage = "register/step1";
        UserRegistrationDto userDto = new UserRegistrationDto();
        if(newUser != null){
            switch (newUser.getStep()) {
                case 1:
                    nextPage = "register/step2";
                    userDto.setFirstName(newUser.getFirstName());
                    userDto.setLastName(newUser.getLastName());
                    userDto.setMiddleName(newUser.getMiddleName());
                    userDto.setRegistrationDate(newUser.getRegistrationDate());
                    List<Region> regions = regionService.getAllRegions();
                    model.addAttribute("regions", regions);
                    model.addAttribute("localities", regions.get(0).getLocalities());
                    break;

                case 2:

                    break;
                default:
                    nextPage = "register/step1";
                    break;
            }

        }
        model.addAttribute("user", userDto);
        return nextPage;
    }
}
