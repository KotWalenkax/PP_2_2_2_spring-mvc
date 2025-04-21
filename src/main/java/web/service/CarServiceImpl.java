package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    @Override
    public List<Car> getCars(int amount) {
        if (cars == null) {
            createCarList();
        }

        if (amount == 0) {
            return List.of();
        }

        if (amount < 5) {
            return cars.subList(0, amount);
        } else {
            return cars;
        }
    }

    private void createCarList() {
        cars = new ArrayList<>();

        cars.add(new Car("toyta", "supra mk", 4));
        cars.add(new Car("toyta", "supra mk", 3));
        cars.add(new Car("toyta", "ae", 86));
        cars.add(new Car("mazda", "rx", 7));
        cars.add(new Car("mazda", "rx", 8));
    }
}
