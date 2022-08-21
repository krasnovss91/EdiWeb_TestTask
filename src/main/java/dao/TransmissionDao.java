package dao;

import entity.Transmission;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.List;

public class TransmissionDao {

    private SessionFactory sessionFactory;

    public TransmissionDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public List<Transmission> getAllDao() throws HibernateException {
        Session session = null;
        List<Transmission> allTransmissions = null;
        try {
            session = sessionFactory.openSession();
            allTransmissions = session.createQuery("FROM Transmission").list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return allTransmissions;
    }


    public Transmission getByIdDao(Integer id) throws SQLException {
        return null;
    }


    public void addDao(Transmission transmission) throws HibernateException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(transmission);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
        } finally {
            session.close();
        }
    }


    public void updateDao(Transmission transmission) throws SQLException {

    }


    public void deleteByIdDao(Integer id) throws SQLException {

    }
}
