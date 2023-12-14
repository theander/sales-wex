package com.wex.salesservice.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "purchase_transactional")
public class PurchaseTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "description", length = 50)
    private String description;
    @Column(name = "transaction_date")
    @DateTimeFormat
    private OffsetDateTime transactionDate;
    @Column(name = "purchase_amount")
    @Min(value = 0, message = "Purchase amount must be positive")
    private BigDecimal purchaseAmount;
    @CreationTimestamp
    @Column(name = "created_timestamp", updatable = false)
    private OffsetDateTime createDate;

}
