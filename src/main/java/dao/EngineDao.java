package dao;

import entity.Engine;
import org.hibernate.*;

import java.sql.SQLException;
import java.util.List;

public class EngineDao {

    private SessionFactory sessionFactory;

    public EngineDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Engine> getAllEnginesDao() throws HibernateException {
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

    public Engine getEngineByIdDao(Integer id) throws HibernateException {
        Session session = null;
        Query query;
        List<Engine> engineList;
        Engine engine = null;
        try {
            session = sessionFactory.openSession();
            query = session.createQuery("from Engine where id =:engineId");
            engineList = query.setParameter("engineId", id).list();
            engine = engineList.get(0);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return engine;
    }

    public void addEngineDao(Engine engine) throws HibernateException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(engine);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
        } finally {
            session.close();
        }
    }

    public void updateEngineDao(Engine engine) throws SQLException {

    }

    public void deleteEngineByIdDao(Integer id) throws HibernateException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            Query query = session.createQuery("DELETE FROM Engine WHERE id =:engineId");
            query.setParameter("engineId", id);
            query.executeUpdate();
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
        } finally {
            session.close();
        }
    }
}
