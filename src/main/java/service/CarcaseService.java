package service;

import dao.CarcaseDao;
import entity.Carcase;
import org.hibernate.HibernateException;

import java.util.List;

public class CarcaseService {

    private static CarcaseService carcaseService;

    private CarcaseDao carcaseDao;

    public CarcaseService(CarcaseDao carcaseDao) {
        this.carcaseDao = carcaseDao;
    }

    public Carcase getCarcaseById(Integer id) {
        Carcase carcase = null;

        try {
            carcase = carcaseDao.getCarcaseByIdDao(id);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return carcase;
    }

    public List<Carcase> getAllCarcases() {
        return carcaseDao.getAllCarcasesDao();
    }

    public void addCarcase(Carcase carcase) {
        carcaseDao.addCarcaseDao(carcase);
    }

    public void updateCarcase(Carcase carcase) {
        carcaseDao.updateCarcaseDao(carcase);
    }

    public void deleteCarcaseById(Integer id) {
        try {
            carcaseDao.deleteCarcaseByIdDao(id);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
}

