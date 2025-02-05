package com.example.sparenet.model;

import jakarta.persistence.*;

@Entity
public class FriendlyShopList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shopListId;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;
}
