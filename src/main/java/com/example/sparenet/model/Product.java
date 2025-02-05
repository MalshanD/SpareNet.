package com.example.sparenet.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String productName;
    private String model;
    private Integer quantity;
    private Double unitPrice;
    private String productCondition;
    private String privacy;

    @ManyToMany
    private List<Category> categories;
}
