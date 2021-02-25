package com.example.JPA;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

// extending to crud repo means that we can use different methods that
// allows us to save, delete and find Car entities
public interface CarRepository extends CrudRepository<Car, Long> {

    // this function returns a list of cars by its brand
    List<Car> findByBrand(String brand);

    // returns one car by its number plate
    Car findByNumberPlate(long numberPlate);

    // returns a list of car by type, "coupe", or "SUV"
    List<Car> findByType(String type);


}
