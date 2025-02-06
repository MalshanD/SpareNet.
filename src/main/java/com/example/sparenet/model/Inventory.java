package com.example.sparenet.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventoryId;

    private Boolean visibilityStatus;

    @ManyToMany(mappedBy = "inventories")
    private List<Product> products;

    @OneToMany(mappedBy = "shop")
    @JoinColumn(name = "owner_id")
    private List<Shop> shop;

}
