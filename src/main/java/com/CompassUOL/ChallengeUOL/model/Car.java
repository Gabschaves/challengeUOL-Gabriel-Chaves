package com.CompassUOL.ChallengeUOL.model;

import com.CompassUOL.ChallengeUOL.exception.BrandException;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@Entity
@Data
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chassiId;


    @Column
    @NotNull
    @NotEmpty
    @Length(max = 50)
    private String modelCar;


    @Column
    @NotNull
    @NotEmpty
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


    public String getMarca() {
        return brand;
    }

    public void setBrand(String brand) {
        if (!isValidBrand(brand)) {
            throw new BrandException(brand);
        }
        this.brand = brand;
    }

    private boolean isValidBrand(String brand) {
        return brand != null && (brand.equals("Ford") || brand.equals("Chevrolet") || brand.equals("BMW") || brand.equals("Volvo"));

    }
}