package com.example.sparenet.model;

import jakarta.persistence.*;

@Entity
public class RequestProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestProductId;

    private String brandName;
    private String modelName;
    private String productName;
    private Integer manufacturingYear;
    private String productStatus;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;
}
