package com.CompassUOL.ChallengeUOL.controller;

import com.CompassUOL.ChallengeUOL.dto.dtoCar;
import com.CompassUOL.ChallengeUOL.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.CompassUOL.ChallengeUOL.repository.RepositoryCar;
import java.util.List;

@RestController
@RequestMapping("/car")
public class Controller {
    @Autowired
    private RepositoryCar repositoryCar;
    @GetMapping
    public List<dtoCar> carList(){
        List<Car> car = repositoryCar.findAll();
        return dtoCar.convert(car);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Car add(@RequestBody Car car){
        return repositoryCar.save(car);
    }

}