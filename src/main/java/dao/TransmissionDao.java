package dao;

import entity.Transmission;
import org.hibernate.*;

import java.sql.SQLException;
import java.util.List;

public class TransmissionDao {

    private SessionFactory sessionFactory;

    public TransmissionDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public List<Transmission> getAllTransmissionsDao() throws HibernateException {
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


    public Transmission getTransmissionByIdDao(Integer id) throws HibernateException {
        Session session = null;
        Query query;
        List<Transmission> transmissionList;
        Transmission transmission = null;
        try {
            session = sessionFactory.openSession();
            query = session.createQuery("from Transmission where id =:transmissionId");
            transmissionList = query.setParameter("transmissionId", id).list();
            transmission = transmissionList.get(0);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return transmission;
    }


    public void addTransmissionDao(Transmission transmission) throws HibernateException {
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


    public void updateTransmissionDao(Transmission transmission) throws SQLException {

    }


    public void deleteTransmissionByIdDao(Integer id) throws HibernateException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            Query query = session.createQuery("DELETE FROM Transmission WHERE id =:transmissionId");
            query.setParameter("transmissionId", id);
            query.executeUpdate();
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
        } finally {
            session.close();
        }
    }
}
