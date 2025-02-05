package com.example.sparenet.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private LocalDate orderDate;
    private Double totalAmount;
    private String orderStatus;

    @ManyToMany(mappedBy = "orders")
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;
}
