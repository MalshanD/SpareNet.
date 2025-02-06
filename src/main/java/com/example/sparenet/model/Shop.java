package com.example.sparenet.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shopId;

    private String shopName;
    private String ownersName;
    private String status;
    private String email;
    private String phoneNumber;
    private LocalDate registerDate;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin addedByAdmin;

    @OneToMany(mappedBy = "shop")
    private List<Order> orders;

    @ManyToOne
    private Inventory inventories;

    @OneToMany(mappedBy = "shop")
    private List<RequestProduct> requestProducts;

    @OneToMany(mappedBy = "receiverShop")
    private List<ShopRequest> receivedShopRequests;

    @OneToMany(mappedBy = "senderShop")
    private List<ShopRequest> sentShopRequests;

    @OneToMany(mappedBy = "shop")
    private List<FriendlyShopList> friendlyShopLists;

    @ManyToMany
    @JoinTable(
            name = "shopList"
            , joinColumns = @JoinColumn(name = "shopId"),
              inverseJoinColumns = @JoinColumn(name = "frindlyshopId")
    )
    private List<Shop> frindlyShopList;
}
