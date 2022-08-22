package service;

import dao.EngineDao;
import entity.Engine;

import java.util.List;

public class EngineService {

    private static EngineService engineService;

    private EngineDao engineDao;

    public EngineService(EngineDao engineDao){
        this.engineDao = engineDao;
    }

    public Engine getEngineById(Integer id) {

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

