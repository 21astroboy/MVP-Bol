package com.bitrekz.bolsta.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "t_team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String description;

    private Date creationDate;

    private String league;

    @ManyToMany
    private List<User> lineup;

    private long captainId;

    //private Map<User, GameRole> gameRolesMap;

    @ManyToOne
    private Picture avatar;

    public Team() {
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public List<User> getLineup() {
        return lineup;
    }

    public void setLineup(List<User> lineup) {
        this.lineup = lineup;
    }

    public long getCaptainId() {
        return captainId;
    }

    public void setCaptainId(long captainId) {
        this.captainId = captainId;
    }

    public Picture getAvatar() {
        return avatar;
    }

    public void setAvatar(Picture avatar) {
        this.avatar = avatar;
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
