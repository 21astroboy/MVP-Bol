package com.bitrekz.bolsta.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "gameroles")
public class GameRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "title")//левый защитник, центральный нападающий, левый полузащ.
    private String title;
    @Column(name = "abbreviation") // ЛЗ, ЦН, ЛПЗ
    private String abbreviation;


    public GameRole(String title, String abbreviation) {
        this.title = title;
        this.abbreviation = abbreviation;
    }


}

