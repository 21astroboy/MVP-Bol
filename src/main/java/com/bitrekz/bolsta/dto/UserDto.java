package com.bitrekz.bolsta.dto;

import com.bitrekz.bolsta.entities.Sex;
import lombok.Data;

import java.util.Date;

@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private Sex sex;
    private Date birthDate;
    private String phone;
    private String phoneCode;
    private Integer town;
    private String password;
    private String passwordConfirmation;

}
