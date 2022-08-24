package service;

import dao.TransmissionDao;
import entity.Transmission;
import org.hibernate.HibernateException;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class TransmissionService {

    private static TransmissionService transmissionService;

    private TransmissionDao transmissionDao;

    public TransmissionService(TransmissionDao transmissionDao) {
        this.transmissionDao = transmissionDao;
    }

    public Transmission getTransmissionById(Integer id) {
        Transmission transmission = null;

        try {
            transmission = transmissionDao.getTransmissionByIdDao(id);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return transmission;
    }

    public List<Transmission> getAllTransmissions() {
        return transmissionDao.getAllTransmissionsDao();
    }

    public void addTransmission(Transmission transmission) {
        transmissionDao.addTransmissionDao(transmission);
    }

    public void updateTransmission(Transmission transmission) {
        transmissionDao.updateTransmissionDao(transmission);
    }

    public void deleteTransmissionById(Integer id) {
        try {
            transmissionDao.deleteTransmissionByIdDao(id);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

}

