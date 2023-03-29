package com.bitrekz.bolsta.entities.cms;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "component")
public class Component {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column()
    private String title;
    @Column()
    private String description;
    @Column()
    @OneToMany
    private List<Link> link;


}
