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
public class DtoCar {

    private Long chassiId;
    private String modelCar;
    private String brand;
    private String color;
    private String fabricationYear;

    public DtoCar(Car car) {
        this.chassiId = car.getChassiId();
        this.modelCar = car.getModelCar();
        this.brand =car.getBrand();
        this.color = car.getColor();
        this.fabricationYear = car.getFabricationYear();
    }
    public static List<DtoCar> convert(List<Car>car){
        return car.stream().map(DtoCar::new).collect(Collectors.toList());

    }

}