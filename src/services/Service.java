/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.ConsultationDao;
import dao.DossierMedicalDao;
import dao.MedecinDao;
import dao.MedicamentDao;
import dao.OrdonanceDao;
import dao.PatientDao;
import dao.PrestationDao;
import dao.ResponsablePDao;
import dao.RvDao;
import dao.SecretaireDao;
import dao.UserDao;
import entities.DossierMedical;
import entities.Medicament;
import entities.Ordonance;
import entities.Rv;
import entities.User;
import java.util.List;

/**
 *
 * @author mouha
 */
public class Service implements IService {
    //dependance avec la couche dao
    ConsultationDao consultationDao = new ConsultationDao();
    DossierMedicalDao dossierMedicalDao = new DossierMedicalDao();
    MedecinDao medecinDao = new MedecinDao();
    MedicamentDao medicamentDao = new MedicamentDao();
    OrdonanceDao ordonanceDao = new OrdonanceDao();
    PatientDao patientDao = new PatientDao();
    PrestationDao prestationDao = new PrestationDao();
    ResponsablePDao responsablePDao = new ResponsablePDao();
    RvDao rvDao = new RvDao();
    SecretaireDao secretaireDao = new SecretaireDao();
    UserDao userDao = new UserDao();

    @Override
    public int addRv(Rv rv) {
        return rvDao.insert(rv);
    }

    public boolean updateRv(Rv rv) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. 
    }

    @Override
    public boolean deleteRv(int id) {
        return rvDao.delete(id)!=0;
    }

    @Override
    public List<Rv> searchAllRv() {
        return rvDao.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rv searchOneRv(int id) {
        return rvDao.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int addOrdonance(Ordonance ordonance) {
        return ordonanceDao.insert(ordonance); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean updateOrdonance(Ordonance ordonance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean deleteOrdonance(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ordonance> searchAllOrdonance() {
        return ordonanceDao.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ordonance searchOneOrdonance(int id) {
        return ordonanceDao.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int addMedicament(Medicament medicament) {
        return medicamentDao.insert(medicament); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ordonance searchOneMedicament(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int addDossierMedical(DossierMedical dossierMedical) {
        return dossierMedicalDao.insert(dossierMedical); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateDossierMedical(DossierMedical dossierMedical) {
        return dossierMedicalDao.update(dossierMedical)!=0; //To change body of generated methods, choose Tools | Templates.
    }

    public boolean deleteDossierMedical(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DossierMedical> searchAllDossierMedical() {
        return dossierMedicalDao.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DossierMedical searchOneDossierMedical(int id) {
        return dossierMedicalDao.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int addUser(User user) {
        return userDao.insert(user); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateUser(User user) {
        return userDao.update(user)!=0; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteUser(int id) {
        return userDao.delete(id)!=0; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> searchAllUser() {
        return userDao.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User searchOneUser(int id) {
        return userDao.findById(id); //To change body of generated methods, choose Tools | Templates.
    }
    
}
