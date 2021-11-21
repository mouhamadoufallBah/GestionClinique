/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author mouha
 */
public class Rv {
    protected int idR;
    protected Date date;
    protected Date heure;
    protected String libelleR;

    public Rv() {
    }

    public Rv(int idR, Date date, Date heure, String libeller) {
        this.idR = idR;
        this.date = date;
        this.heure = heure;
        this.libelleR = libelleR;
    }

    public Rv(Date date, Date heure, String libeller) {
        this.date = date;
        this.heure = heure;
        this.libelleR = libelleR;
    }
//test
    public Rv(int idR, String libelleR) {
        this.idR = idR;
        this.libelleR = libelleR;
    }


    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getHeure() {
        return heure;
    }

    public void setHeure(Date heure) {
        this.heure = heure;
    }

    public String getLibelleR() {
        return libelleR;
    }

    public void setLibelleR(String libelleR) {
        this.libelleR = libelleR;
    }

    @Override
    public String toString() {
        return "Rv{" + "idR=" + idR + ", date=" + date + ", heure=" + heure + ", libelleR=" + libelleR + '}';
    }

 
    
    
}
