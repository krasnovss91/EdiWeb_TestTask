package dao;

import entity.Car;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.SQLException;
import java.util.List;

public class CarDao {

    private SessionFactory sessionFactory;

    public CarDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Car> getAllDao() throws HibernateException {
        Session session = null;
        List<Car> allCars = null;
        try {
            session = sessionFactory.openSession();

            allCars = session.createQuery("FROM Car").list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return allCars;

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
