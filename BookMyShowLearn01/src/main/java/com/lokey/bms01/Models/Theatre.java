package com.lokey.bms01.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel {
    private String name;
    @ManyToOne
    private Region region;
    private String address;
//    private List<Show> shows;
//    private List<Screen> screens;
//    private List<Movie> movies;
}