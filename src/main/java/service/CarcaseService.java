package service;

import dao.CarcaseDao;
import entity.Carcase;

import java.util.List;

public class CarcaseService {

    private static CarcaseService carcaseService;

    private CarcaseDao carcaseDao;

    public CarcaseService(CarcaseDao carcaseDao) {
        this.carcaseDao = carcaseDao;
    }
    public Carcase getCarcaseById(Integer id) {

    }

    public List<Carcase> getAllCarcases() {

    }

    public void addCar(Carcase carcase) {

    }

    public void updateCar(Carcase carcase) {

    }

    public void deleteCarById(Carcase carcase) {

    }
}
}
