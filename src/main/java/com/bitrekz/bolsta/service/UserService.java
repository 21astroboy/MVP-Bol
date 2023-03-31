package com.bitrekz.bolsta.service;

import com.bitrekz.bolsta.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User getUserById();

    User getCurrentUser();

    User getUserByPhone(String phone);

    User createUser(User user);
}
