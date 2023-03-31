package com.bitrekz.bolsta.controller;

import com.bitrekz.bolsta.model.Sex;
import com.bitrekz.bolsta.model.User;
import com.bitrekz.bolsta.service.UserService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.WebAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;

import static com.bitrekz.bolsta.constants.WebConstants.AUTH_FAIL_MESSAGE_KEY;


@Controller
public class MainPageController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping(value = {"/", "/index"})
    public String indexPage() {
        return "index";
    }

    @GetMapping(value = "/login")
    public String loginForm(@RequestParam(required = false) String auth, HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();

        if ("failed".equals(auth)) {
            String errorMessage = Optional.ofNullable(session).map(httpSession -> httpSession.getAttribute(WebAttributes.AUTHENTICATION_EXCEPTION))
                    .map(Exception.class::cast)
                    .map(Throwable::getMessage)
                    .orElse(Strings.EMPTY);
            model.addAttribute(AUTH_FAIL_MESSAGE_KEY, errorMessage);
        }
        return "login";
    }

    @GetMapping("/profile")
    @ResponseBody
    public ResponseEntity<User> getUserinfo() {
        User user = userService.getCurrentUser();
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/test/create")
    @ResponseBody
    public ResponseEntity<String> createTestUser() {
        User user = userService.getUserByPhone("79167421697");
        if (user != null) {
            return new ResponseEntity<>("User already exists", HttpStatus.BAD_REQUEST);
        }
        User testUser = new User();
        testUser.setPhone("79167421697");
        testUser.setFirstName("Alex");
        testUser.setLastName("Tarin");
        testUser.setEmail("aletarin@yandex.ru");
        testUser.setEmailConfirmed(true);
        testUser.setBanned(false);
        testUser.setSex(Sex.MALE);
        testUser.setStartNumber(9);
        testUser.setPassword(passwordEncoder.encode("123456"));
        userService.createUser(testUser);
        return new ResponseEntity<>("Test user created", HttpStatus.OK);
    }
}
