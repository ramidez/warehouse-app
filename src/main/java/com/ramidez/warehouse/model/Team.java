package com.ramidez.warehouse.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "number")
    private Integer number;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "team")
    private Set<Item> items;
}
