package dao;

import entity.Car;
import org.hibernate.*;

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

    public Car getByIdDao(Integer id) throws HibernateException {
        Session session = null;
        Query query;
        List<Car> carList;
        Car car = null;
        try {
            session = sessionFactory.openSession();
            query = session.createQuery("from Car where id =:carId");
            carList = query.setParameter("carId", id).list();
            car = carList.get(0);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return car;
    }

    public void addDao(Car car) throws HibernateException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(car);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
        } finally {
            session.close();
        }
    }

    public void updateDao(Car car) throws SQLException {

    }

    public void deleteByIdDao(Integer id) throws SQLException {

    }
}
