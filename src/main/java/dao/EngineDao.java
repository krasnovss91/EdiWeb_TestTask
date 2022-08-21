package dao;

import entity.Engine;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.SQLException;
import java.util.List;

public class EngineDao {

    private SessionFactory sessionFactory;

    public EngineDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Engine> getAllDao() throws HibernateException {
        Session session = null;
        List<Engine> allEngines = null;
        try {
            session = sessionFactory.openSession();

            allEngines = session.createQuery("FROM Engine").list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return allEngines;

    }

    public Engine getByIdDao(Integer id) throws SQLException {
        return null;
    }

    public void addDao(Engine engine) throws SQLException {

    }

    public void updateDao(Engine engine) throws SQLException {

    }

    public void deleteByIdDao(Integer id) throws SQLException {

    }
}
