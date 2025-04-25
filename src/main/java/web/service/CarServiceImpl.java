package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarDao carDao;

    @Override
    public List<Car> getCars(int amount) {
        if (amount == 0) {
            return List.of();
        } else {
            return carDao.getCarsByCount(amount >= 5 ? 5 : amount);
        }
    }
}
