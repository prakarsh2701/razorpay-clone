package com.prakarsh.razorpay.operations.entity;

import com.prakarsh.razorpay.common.entity.BaseEntity;
import com.prakarsh.razorpay.operations.entity.Settlement;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "settlement_payment")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SettlementPayment extends BaseEntity {

    @EmbeddedId
    private com.codingshuttle.razorpay.operations.entity.SettlementPaymentId id;

    @MapsId("settlementId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "settlement_id", nullable = false)
    private Settlement settlement;
}
