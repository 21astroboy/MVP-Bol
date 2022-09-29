package com.bitrekz.bolsta.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_sport")
public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String description;

    @OneToMany
    private List<GameRole> gameRoles;

    public Sport() {
    }

    public List<GameRole> getGameRoles() {
        return gameRoles;
    }

    public void setGameRoles(List<GameRole> gameRoles) {
        this.gameRoles = gameRoles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
