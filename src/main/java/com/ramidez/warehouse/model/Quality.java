package com.ramidez.warehouse.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "quality")
public class Quality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;


}
