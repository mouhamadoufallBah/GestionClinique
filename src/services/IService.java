/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

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
public interface IService {

    //GERER_RV
    public int addRv(Rv rv);
    //public boolean updateRv(Rv rv);
    public boolean deleteRv(int id);
    public List<Rv> searchAllRv();
    public Rv searchOneRv(int id);
     
    //GERER_ORDONANCE
    public int addOrdonance(Ordonance ordonance);
    //public boolean updateOrdonance(Ordonance ordonance);
    //public boolean deleteOrdonance(int id);
    public List<Ordonance> searchAllOrdonance();
    public Ordonance searchOneOrdonance(int id);
    
    
    
    
    //GERER_MEDICAMENT
    public int addMedicament(Medicament medicament);
    public Ordonance searchOneMedicament(int id);
    
    
    
    //GERER_DOSSIER_MEDICAL
    public int addDossierMedical(DossierMedical dossierMedical);
    public boolean updateDossierMedical(DossierMedical dossierMedical);
    //public boolean deleteDossierMedical(int id);
    public List<DossierMedical> searchAllDossierMedical();
    public DossierMedical searchOneDossierMedical(int id);
    
    
    
    
    //GERER_USER
    public int addUser(User user);
    public boolean updateUser(User user);
    public boolean deleteUser(int id);
    public List<User> searchAllUser();
    public User searchOneUser(int id);
    
    
    
}
