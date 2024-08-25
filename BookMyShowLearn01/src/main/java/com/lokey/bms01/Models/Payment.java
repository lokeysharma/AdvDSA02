package com.lokey.bms01.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    private int amount;
    private Date paymentDate;
    private String refNumber;
    @ManyToOne
    private Booking booking;
    @Enumerated(value = EnumType.ORDINAL)
    private PaymentMode paymentMode;
    @Enumerated(value = EnumType.ORDINAL)
    private PaymentGateway paymentGateway;
    private PaymentStatus paymentStatus;
}