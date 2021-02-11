package com.galvanize.speedwaytrails.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Driver {

    @Id
    public long id;

    public String firstName;
    public String lastName;
    public int age;
    public String nickname;

    @OneToMany(targetEntity=RaceCar.class,cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true)
    public List<RaceCar> raceCarList;

    public int wins;
    public int losses;
}
