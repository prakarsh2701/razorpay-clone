package com.prakarsh.razorpay.merchent.entity;

import jakarta.persistence.*;

import java.util.UUID;
@Entity
@Table(name="api_key")
public class APIKey {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "merchant_id",nullable = false)
    private Merchant merchant;
    @Column(nullable = false, length = 100)
    private String keyId;
    @Column(nullable = false, length = 200)
    private String keySecretHash;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private String environment;
    @Column(nullable = false)
    private boolean enabled=true;
    private java.time.LocalDateTime lastUsedAt;
    private  java.time.LocalDateTime rotatedAt;
    private java.time.LocalDateTime gracePeriodExpiryAt;
}
