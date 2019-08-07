package com.ramidez.warehouse.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "Item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "purchaseDate")
    private LocalDate purchaseDate;

    @Column(name = "productionDate")
    private LocalDate productionDate;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;

}
