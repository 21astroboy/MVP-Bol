package com.bitrekz.bolsta.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.TimeZone;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @ManyToOne
    private Region region;
    private TimeZone timeZone;
    private int population;


}
