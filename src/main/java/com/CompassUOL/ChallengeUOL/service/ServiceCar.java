package com.CompassUOL.ChallengeUOL.service;

import com.CompassUOL.ChallengeUOL.dto.DtoCar;
import com.CompassUOL.ChallengeUOL.model.Car;
import com.CompassUOL.ChallengeUOL.repository.RepositoryCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCar{

    @Autowired
    RepositoryCar repositoryCar;

    public List<Car> findAll(){
        return repositoryCar.findAll();
    }

    public Optional<Car> carFindById(Car car,Long chassiId){
        return repositoryCar.findById(chassiId);
    }
}

