package com.CompassUOL.ChallengeUOL.repository;

import com.CompassUOL.ChallengeUOL.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepositoryCar extends JpaRepository<Car,Long> {

}
