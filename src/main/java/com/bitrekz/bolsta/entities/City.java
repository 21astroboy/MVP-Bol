package com.bitrekz.bolsta.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.TimeZone;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "region")
    private String region;
    @Column(name = "timezone")
    private TimeZone timeZone;
    @Column(name = "population")
    private int population;


}
