package com.bitrekz.bolsta.repository;

import com.bitrekz.bolsta.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByPhone(String phone);

    User findByEmail(String email);
}
