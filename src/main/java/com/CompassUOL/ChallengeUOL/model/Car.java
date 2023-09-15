package com.CompassUOL.ChallengeUOL.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chassiId;

    @Column
    private String modelCar;

    @Column
    private String brand;

    @Column
    private String color;

    @Column
    private String fabricationYear;

}