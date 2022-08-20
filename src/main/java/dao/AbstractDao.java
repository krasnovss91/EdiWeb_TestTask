package dao;

import java.sql.SQLException;
import java.util.List;

public interface AbstractDao {

    List<Object> getAllDao();

    Object getByIdDao(Integer id) throws SQLException;

    void addDao(Object object) throws SQLException;

    void deleteByIdDao(Integer id) throws SQLException;
}
