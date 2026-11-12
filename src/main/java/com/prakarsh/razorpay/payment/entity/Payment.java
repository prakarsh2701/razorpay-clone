package com.prakarsh.razorpay.payment.entity;

import com.prakarsh.razorpay.common.entity.Money;
import com.prakarsh.razorpay.common.enums.PaymentMethod;
import com.prakarsh.razorpay.common.enums.PaymentStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy=jakarta.persistence.GenerationType.UUID)
    private UUID id;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @Column(name = "order_id",nullable = false)
    private OrderRecord order;
    @Column(nullable = false)
    private UUID merchantId;
    @Embedded
    private Money amount;
    @Column(nullable = false,length = 100)
    private String idempotencyKey;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false,length = 20)
    private PaymentStatus status;
    @Column(nullable = false)
    private PaymentMethod method;
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String,Object> methodDetails;
    @Column(length = 100)
    private String bankreference;
    @Column(length = 100)
    private String errorCode;
    private String errorDescription;
    private LocalDateTime authorizedAt;
    private LocalDateTime capturedAt;

}
