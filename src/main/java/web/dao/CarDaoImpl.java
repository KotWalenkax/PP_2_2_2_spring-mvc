package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars;

    public CarDaoImpl() {
        cars = new ArrayList<>();

        cars.add(new Car("toyta", "supra mk", 4));
        cars.add(new Car("toyta", "supra mk", 3));
        cars.add(new Car("toyta", "ae", 86));
        cars.add(new Car("mazda", "rx", 7));
        cars.add(new Car("mazda", "rx", 8));
    }

    @Override
    public List<Car> getCarsByCount(int amount) {
        return cars.subList(0, amount);
    }
}
