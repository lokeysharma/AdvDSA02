package com.lokey.bms01.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Getter@Setter
@Entity
public class Booking extends BaseModel{

    @ManyToOne
    private User bookedBy;
    private Date bookedAt;
    @ManyToMany
    private List<ShowSeat> seats;
    @OneToMany
    private List<Payment> payments;
    private int amount;
    @Enumerated(value = EnumType.STRING)
    private BookingStatus  bookingStatus;
}
