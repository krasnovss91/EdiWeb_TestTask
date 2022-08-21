package dao;

import entity.Car;
import org.hibernate.SessionFactory;

import java.sql.SQLException;
import java.util.List;

public class CarDao {

    private SessionFactory sessionFactory;

    public CarDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Car> getAllDao() {
        return null;
    }

    public Car getByIdDao(Integer id) throws SQLException {
        return null;
    }

    public void addDao(Car car) throws SQLException {

    }

    public void updateDao(Car car) throws SQLException {

    }

    public void deleteByIdDao(Integer id) throws SQLException {

    }
}
