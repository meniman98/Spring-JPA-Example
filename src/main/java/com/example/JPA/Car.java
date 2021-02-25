package com.example.JPA;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// entity means this will be an entity, thing, object in a database
@Entity
public class Car {

    // ID means this property will act as the ID. Most typically a Long, not int
    @Id
    // GeneratedValue means this property (the ID) will automatically generate a new one
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numberPlate;
    private String brand;
    private String model;
    private String type;

    // this protected empty constructor looks odd but it's their for the sake of JPA
    protected Car() {}

    // this constructor will be used to create instances
    public Car(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    public Long getNumberPlate() {
        return numberPlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberPlate=" + numberPlate +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
