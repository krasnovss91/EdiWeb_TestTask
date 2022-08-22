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

    public void addCarcase(Carcase carcase) {

    }

    public void updateCarcase(Carcase carcase) {

    }

    public void deleteCarcaseById(Carcase carcase) {

    }
}
}
