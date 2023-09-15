package com.CompassUOL.ChallengeUOL.dto;

import com.CompassUOL.ChallengeUOL.model.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class dtoCar {

    private Long chassiId;
    private String modelCar;
    private String brand;
    private String color;
    private String fabricationYear;

    public dtoCar(Car car) {
        this.chassiId = car.getChassiId();
        this.modelCar = car.getModelCar();
        this.brand =car.getBrand();
        this.color = car.getColor();
        this.fabricationYear = car.getFabricationYear();
    }
    public static List<dtoCar> convert(List<Car>car){
        return car.stream().map(dtoCar::new).collect(Collectors.toList());

    }

}