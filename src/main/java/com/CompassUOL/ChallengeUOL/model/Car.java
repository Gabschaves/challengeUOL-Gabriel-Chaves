package com.CompassUOL.ChallengeUOL.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chassiId;

    @Column(name="model", nullable = false)
    private String modelCar;

    @Column(name = "brand",nullable = false)
    private String brand;

    @Column(name="color", nullable = false)
    private String color;

    @Column(name="fabricationYear",nullable = false)
    private String fabricationYear;

}
