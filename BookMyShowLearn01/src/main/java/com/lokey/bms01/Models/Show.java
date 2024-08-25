package com.lokey.bms01.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name = "shows")
public class Show extends BaseModel {
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Screen screen;
    private Date startTime;
    private Date endTime;
    // status
    @OneToMany
    private List<ShowSeat> seats;
    // price
    @OneToMany
    private List<ShowSeatType> showSeatTypes;
    @Enumerated(value = EnumType.ORDINAL)
    @ElementCollection
    private List<Features> features;
}