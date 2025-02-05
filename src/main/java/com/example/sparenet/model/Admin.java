package com.example.sparenet.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;

    private String adminName;
    private String phoneNumber;

    @OneToMany(mappedBy = "addedByAdmin")
    private List<Product> products;

    @OneToMany(mappedBy = "addedByAdmin")
    private List<Shop> shops;

    @OneToMany(mappedBy = "admin")
    private List<RequestProduct> requestProducts;
}
