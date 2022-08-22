package service;

import dao.EngineDao;
import entity.Engine;
import org.hibernate.HibernateException;

import java.util.List;

public class EngineService {

    private static EngineService engineService;

    private EngineDao engineDao;

    public EngineService(EngineDao engineDao) {
        this.engineDao = engineDao;
    }

    public Engine getEngineById(Integer id) {
        Engine engine = null;

        try {
            engine = engineDao.getEngineByIdDao(id);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return engine;
    }

    public List<Engine> getAllEngines() {

    }

    public void addEngine(Engine engine) {

    }

    public void updateEngine(Engine engine) {

    }

    public void deleteEngineById(Engine engine) {

    }
}

