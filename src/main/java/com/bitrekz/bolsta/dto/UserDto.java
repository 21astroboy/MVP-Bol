package com.bitrekz.bolsta.dto;

import com.bitrekz.bolsta.entities.Sex;
import lombok.Data;

@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private String middleName;
    private Sex sex;
    private String phone;
    private String town;
    private String password;
    private String passwordConfirmation;

}
