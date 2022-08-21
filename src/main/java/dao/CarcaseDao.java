package dao;

import entity.Carcase;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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

    public Carcase getByIdDao(Integer id) throws SQLException {
        return null;
    }

    public void addDao(Carcase carcase) throws SQLException {

    }

    public void updateDao(Carcase carcase) throws SQLException {

    }

    public void deleteByIdDao(Integer id) throws SQLException {

    }
}
