package com.prakarsh.razorpay.merchent.entity;

import com.prakarsh.razorpay.common.enums.BusinessType;
import com.prakarsh.razorpay.common.enums.MerchantStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Entity
@Table
@Getter
@AllArgsConstructor
@Builder
public class Merchant {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
    private UUID id;

    @Column(nullable = false,length = 200)
    private String name;
    @Column(nullable = false, unique = true)
    private  String email;
    @Column(nullable = false, unique = true)
    private String contactNumber;

    @Column(length = 50)
    @Enumerated(EnumType.STRING)
    private BusinessType businessType;
    @Column(length = 200)
    private String businessName;
    @Column(length = 200)
    private String websiteURL;
    @Column(length = 200,nullable = false)
    @Enumerated(EnumType.STRING)
    private MerchantStatus status= MerchantStatus.PENDING_KYC;
    @Column(length = 20)
    private String gstID;
    @Column(length = 20)
    private String panID;
    @Column(length = 20)
    private String settlementBankAccount;
    @Column(length = 200)
    private String settlementBankIfsc;
    @Column(length = 20)
    private String SettlementBankAccountHolderName;
}