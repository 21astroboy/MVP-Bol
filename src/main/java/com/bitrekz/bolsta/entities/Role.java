package com.bitrekz.bolsta.entities;

import lombok.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.text.MessageFormat;

import static com.bitrekz.bolsta.constants.ModelConstants.SITE_ROLE_PATTERN;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "roles")
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Role(String name) {
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return StringUtils.isNotEmpty(name) ? MessageFormat.format(SITE_ROLE_PATTERN, name) : null;
    }
}
