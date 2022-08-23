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
        return engineDao.getAllEnginesDao();
    }

    public void addEngine(Engine engine) {
        engineDao.addEngineDao(engine);
    }

    public void updateEngine(Engine engine) {
        engineDao.updateEngineDao(engine);
    }

    public void deleteEngineById(Integer id) {
        try {
            engineDao.deleteEngineByIdDao(id);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
}

