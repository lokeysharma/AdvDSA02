package com.lokey.bms01.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModel {
    private String name;
    @Enumerated(value = EnumType.ORDINAL)
    @ElementCollection
    private List<Features> features;
    @ManyToOne
    private Theatre theatre;
    @OneToMany
    private List<Seat> seats;
}