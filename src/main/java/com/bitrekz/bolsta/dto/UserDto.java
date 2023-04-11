package com.bitrekz.bolsta.dto;

import com.bitrekz.bolsta.entities.Sex;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
public class UserDto {
    @NotNull
    @NotEmpty
    @Pattern(regexp = "^[А-Яа-яЁ\\-]+$\n")
    private String firstName;
    @NotNull
    @NotEmpty
    @Pattern(regexp = "^[А-Яа-яЁ\\-]+$\n")
    private String lastName;
    @NotNull
    @NotEmpty
    private Sex sex;
    @NotNull
    @NotEmpty
    @Pattern(regexp = "^(?:0[1-9]|[12]\\d|3[01])([\\/.-])(?:0[1-9]|1[012])\\1(?:19|20)\\d\\d$")
    private Date birthDate;
    @NotNull
    @NotEmpty
    @Pattern(regexp = "^(\\+7|7|8)?[\\s\\-]?\\(?[489][0-9]{2}\\)?[\\s\\-]?[0-9]{3}[\\s\\-]?[0-9]{2}[\\s\\-]?[0-9]{2}$")
    private String phone;
    @NotNull
    @NotEmpty
    private String phoneCode;
    @NotNull
    @NotEmpty
    private Integer town;
    @NotNull
    @NotEmpty
    @Pattern(regexp = "^((?=\\S*?[A-Z])(?=\\S*?[a-z])(?=\\S*?[0-9]).{6,})\\S$")
    private String password;
    @NotNull
    @NotEmpty
    private String passwordConfirmation;

}
