//package com.ramidez.warehouse.model;
//
//import lombok.Data;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Data
//@Entity
//@Table(name = "warehouse")
//public class Warehouse {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "location_Name")
//    private String locationName;
//
//    @OneToMany(mappedBy = "warehouse")
//    private Set<Item> items;
//}
