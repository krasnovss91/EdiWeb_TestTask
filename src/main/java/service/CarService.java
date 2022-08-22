package service;

import dao.CarDao;
import entity.Car;
import org.hibernate.HibernateException;

import java.sql.SQLException;
import java.util.List;

public class CarService {

    private static CarService carService;

    private CarDao carDao;

    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }


    public Car getCarById(Integer id) {
        Car car = null;
        try {
            car = carDao.getCarByIdDao(id);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return car;
    }

    public List<Car> getAllCars() {
       return carDao.getAllCarDao();
    }

    public void addCar(Car car) {

    }

    public void updateCar(Car car) {

    }

    public void deleteCarById(Car car) {

    }
}
