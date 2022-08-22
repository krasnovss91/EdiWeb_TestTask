package service;

import dao.TransmissionDao;
import entity.Transmission;
import org.hibernate.HibernateException;

import java.util.List;

public class TransmissionService {

    private static TransmissionService transmissionService;

    private TransmissionDao transmissionDao;

    public TransmissionService(TransmissionDao transmissionDao){
        this.transmissionDao = transmissionDao;
    }

    public Transmission getTransmissionById(Integer id) {
        Transmission transmission = null;

        try {
            transmission = transmissionDao.getTransmissionByIdDao(id);
        } catch (HibernateException e){
            e.printStackTrace();
        }
        return transmission;
    }

    public List<Transmission> getAllTransmissions() {
         return transmissionDao.getAllTransmissionsDao();
    }

    public void addTransmission(Transmission transmission) {

    }

    public void updateTransmission(Transmission transmission) {

    }

    public void deleteTransmissionById(Transmission transmission) {

    }
}

