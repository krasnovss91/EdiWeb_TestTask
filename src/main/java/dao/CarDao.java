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

    public List<Car> getAllCarDao() throws HibernateException {
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

    public Car getCarByIdDao(Integer id) throws HibernateException {
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

    public void addCarDao(Car car) throws HibernateException {
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

    public void updateCarDao(Car car) throws HibernateException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.createQuery("UPDATE Car SET carcase=:carcase, engine=:engine, transmission=:transmission WHERE id=:id")
                    .setParameter("carcase", car.getCarcase())
                    .setParameter("engine", car.getEngine())
                    .setParameter("transmission", car.getTransmission())
                    .setParameter("id", car.getId())
                    .executeUpdate();
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
        } finally {
            session.close();
        }
    }

    public void deleteCarByIdDao(Integer id) throws HibernateException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            Query query = session.createQuery("DELETE FROM Car WHERE id =: carId");
            query.setParameter("carId", id);
            query.executeUpdate();
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
        } finally {
            session.close();
        }
    }
}
