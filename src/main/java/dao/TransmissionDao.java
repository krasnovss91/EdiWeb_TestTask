package dao;

import entity.Transmission;
import org.hibernate.SessionFactory;

import java.sql.SQLException;
import java.util.List;

public class TransmissionDao  {

    private SessionFactory sessionFactory;

    public TransmissionDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public List<Transmission> getAllDao() {
        return null;
    }


    public Transmission getByIdDao(Integer id) throws SQLException {
        return null;
    }


    public void addDao(Transmission transmission) throws SQLException {

    }


    public void updateDao(Transmission transmission) throws SQLException {

    }


    public void deleteByIdDao(Integer id) throws SQLException {

    }
}
