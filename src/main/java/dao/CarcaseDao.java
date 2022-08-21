package dao;

import entity.Carcase;
import org.hibernate.*;

import java.sql.SQLException;
import java.util.List;

public class CarcaseDao {

    private SessionFactory sessionFactory;

    public CarcaseDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Carcase> getAllDao() throws HibernateException {
        Session session = null;
        List<Carcase> allCarcases = null;
        try {
            session = sessionFactory.openSession();

            allCarcases = session.createQuery("FROM Carcase").list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return allCarcases;
    }

    public Carcase getByIdDao(Integer id) throws HibernateException {
        Session session = null;
        Query query;
        List<Carcase> carcaseList;
        Carcase carcase = null;
        try {
            session = sessionFactory.openSession();
            query = session.createQuery("from Carcase where id =:carcaseId");
            carcaseList = query.setParameter("carcaseList", id).list();
            carcase = carcaseList.get(0);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return carcase;
    }

    public void addDao(Carcase carcase) throws HibernateException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(carcase);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
        } finally {
            session.close();
        }
    }

    public void updateDao(Carcase carcase) throws SQLException {

    }

    public void deleteByIdDao(Integer id) throws HibernateException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            Query query = session.createQuery("DELETE FROM Carcase WHERE id =:carcaseId");
            query.setParameter("carcaseId", id);
            query.executeUpdate();
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
        } finally {
            session.close();
        }
    }
}
