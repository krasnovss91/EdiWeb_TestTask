package service;

import dao.CarDao;
import entity.Car;
import entity.Carcase;
import entity.Engine;
import entity.Transmission;
import org.hibernate.HibernateException;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class CarService {

    private static CarService carService;

    @EJB
    private static CarcaseService carcaseService;

    @EJB
    private static EngineService engineService;

    @EJB
    private static TransmissionService transmissionService;

    private CarDao carDao;

    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    public void assebmleCar(Carcase carcase, Engine engine, Transmission transmission){
        addCar(new Car(carcase,engine,transmission));//нельзя использовать составляющие больше 1 раза, поэтому после сборки удалить из бд
        carcaseService.deleteCarcaseById(carcase.getId());
        engineService.deleteEngineById(engine.getId());
        transmissionService.deleteTransmissionById(transmission.getId());
    }

    public void disassembleCar(Car car){//разберём на составляющие, удалим из бд, а составляющие сохраним
        carcaseService.addCarcase(car.getCarcase());
        engineService.addEngine(car.getEngine());
        transmissionService.addTransmission(car.getTransmission());
        deleteCarById(car.getId());
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
        carDao.addCarDao(car);
    }

    public void updateCar(Car car) {
        carDao.updateCarDao(car);
    }

    public void deleteCarById(Integer id) {
        try {
            carDao.deleteCarByIdDao(id);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
}
