package controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.RepositoryCar;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private RepositoryCar repositoryCar;
    @GetMapping("/car")
    public List<Car> carList(){
        return repositoryCar.findAll();
    }
}
