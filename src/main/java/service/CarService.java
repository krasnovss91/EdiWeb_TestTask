package service;

import dao.CarDao;
import entity.Car;

import java.util.List;

public class CarService {

    private static CarService carService;

    private CarDao carDao;

    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    public Car getCarById(Integer id) {

    }

    public List<Car> getAllCars() {

    }

    public void addCar(Car car) {

    }

    public void updateCar(Car car) {

    }

    public void deleteCarById(Car car) {

    }
}
