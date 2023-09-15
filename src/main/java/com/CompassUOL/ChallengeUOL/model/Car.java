package com.CompassUOL.ChallengeUOL.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotEmpty
    @NotNull
    @Length(max = 25)
    private Long chassiId;

    @Column
    @NotNull
    @NotEmpty
    @Length(max = 50)
    private String modelCar;

    @Column
    @NotNull
    @NotEmpty
    @Length(max = 30)
    private String brand;

    @Column
    @NotNull
    @NotEmpty
    @Length(max = 30)
    private String color;

    @Column
    @NotNull
    @NotEmpty
    @Length(max = 4)
    private String fabricationYear;

}