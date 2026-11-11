package com.prakarsh.razorpay.payment.entity;

import com.prakarsh.razorpay.common.entity.Money;
import com.prakarsh.razorpay.common.enums.OrderStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "order_record")
public class OrderRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    // no FK- cross service, so we will just store the merchant id here
    @Column(name = "merchant_id", nullable = false)
    private UUID merchantId;

    @Embedded
    private Money amount;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private OrderStatus status= OrderStatus.Created;

    @Column(nullable = false)
    private Integer attempts=0;

    @JdbcTypeCode((SqlTypes.JSON))
    @Column(columnDefinition = "json")
    private Map<String, Object> notes;

    @Column(nullable = false)
    private LocalDateTime expiredAt;

}
