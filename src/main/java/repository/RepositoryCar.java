package repository;

import model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCar extends JpaRepository<Car,Long> {

}
