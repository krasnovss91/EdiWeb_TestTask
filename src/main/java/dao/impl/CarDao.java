package dao.impl;

import dao.AbstractDao;
import org.hibernate.SessionFactory;

import java.sql.SQLException;
import java.util.List;

public class CarDao implements AbstractDao {

    private SessionFactory sessionFactory;

    public CarDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Object> getAllDao() {
        return null;
    }

    @Override
    public Object getByIdDao(Integer id) throws SQLException {
        return null;
    }

    @Override
    public void addDao(Object object) throws SQLException {

    }

    @Override
    public void updateDao(Object object) throws SQLException {

    }

    @Override
    public void deleteByIdDao(Integer id) throws SQLException {

    }
}
