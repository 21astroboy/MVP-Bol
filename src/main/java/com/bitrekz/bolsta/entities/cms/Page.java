package com.bitrekz.bolsta.entities.cms;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pages")
@Getter
@Setter
@NoArgsConstructor
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    @OneToMany
    private Component component;


}
