package com.example.JPA;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class JpaApplication {

    private static final String findAll = "Going to find all cars in the database:";
    private static final String dash = "-------------------------------";
    private static final String findOneCar = "Going to find the car with a license plate of: ";
    private static final String findByType = "Going to find all cars of type: ";


    private static final Logger log =
            LoggerFactory.getLogger(JpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CarRepository repository) {
        return (args) -> {
            log.info("");
            // here we're storing some cars
            repository.save(new Car("Mercedes-Benz", "C Class", "Saloon"));
            repository.save(new Car("Mercedes-Benz", "S Class", "Saloon"));
            repository.save(new Car("Audi", "A7", "Coupe"));
            repository.save(new Car("Audi", "Q8", "SUV"));
            repository.save(new Car("Audi", "A5", "Coupe"));
            repository.save(new Car("BMW", "M4", "Coupe"));
            repository.save(new Car("BMW", "3 Series", "Saloon"));
            repository.save(new Car("BMW", "X7", "SUV"));
            repository.save(new Car("Jaguar", "I-Pace", "SUV"));
            repository.save(new Car("Alfa Romeo", "Stelvio", "SUV"));

            // get all cars
            log.info(findAll);
            log.info(dash);
            for (Car car : repository.findAll()) {
                log.info(car.toString());
            }

            // get a car by its numberplate (id)
            Car car = repository.findByNumberPlate(2); // the Mercedes S Class
            log.info(findOneCar + car.getNumberPlate());
            log.info(dash);
            log.info(car.toString());
            log.info("");

            // find a car by its type, (coupe)
            log.info(findByType + "Coupe");
            log.info(dash);
            repository.findByType("Coupe").forEach(carType -> {
                log.info(carType.toString());
            });

            log.info("");
        };
    }

}
