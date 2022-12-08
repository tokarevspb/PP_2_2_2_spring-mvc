package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    static List<Car> cars;

    {
        cars = Arrays.asList(
                new Car("Audi", 3, "black"),
                new Car("BMW", 5, "blue"),
                new Car("Chevrolet", 777, "yellow"),
                new Car("Datsun", 510, "white"),
                new Car("Ford", 100, "green")
        );
    }

    public static List<Car> getCars(int count) {
        return cars.subList(0, (count > cars.size() ? cars.size() : count));
    }
}
