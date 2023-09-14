package model;

import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String nameCar;
    @Column
    private String brand;
    @Column
    private String color;
    @Column
    private String fabricationYear;

}
