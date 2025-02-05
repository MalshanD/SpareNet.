package com.example.sparenet.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ShopRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;

    private String requestStatus;
    private LocalDate requestDate;

    @ManyToOne
    @JoinColumn(name = "receiver_shop_id")
    private Shop receiverShop;

    @ManyToOne
    @JoinColumn(name = "sender_shop_id")
    private Shop senderShop;
}
