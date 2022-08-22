package service;

import dao.TransmissionDao;
import entity.Transmission;

import java.util.List;

public class TransmissionService {

    private static TransmissionService transmissionService;

    private TransmissionDao transmissionDao;

    public TransmissionService(TransmissionDao transmissionDao){
        this.transmissionDao = transmissionDao;
    }

    public Transmission getTransmissionById(Integer id) {

    }

    public List<Transmission> getAllTransmissions() {

    }

    public void addTransmission(Transmission transmission) {

    }

    public void updateTransmission(Transmission transmission) {

    }

    public void deleteTransmissionById(Transmission transmission) {

    }
}

