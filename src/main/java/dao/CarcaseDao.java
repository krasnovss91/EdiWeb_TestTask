package dao;

import entity.Carcase;
import org.hibernate.SessionFactory;

import java.sql.SQLException;
import java.util.List;

public class CarcaseDao {

    private SessionFactory sessionFactory;

    public CarcaseDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Carcase> getAllDao() {
        return null;
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
