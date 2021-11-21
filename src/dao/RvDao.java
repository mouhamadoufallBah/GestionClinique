/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Rv;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mouha
 */
public class RvDao implements IDao<Rv> {
    
    DataBase database= new DataBase();
    
    /*Request sql*/
    private final String SQL_INSERT = "INSERT INTO `rv` "
            + " ( `date`, `heure`,  `libelleR`, `Temperature`, 'tension', 'prestationAf', 'libelleP', 'idC', 'idP') "
            + " VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";
    private final String SQL_DELETE="Delete from rv where idR=?";
    private final String SQL_ALL=" SELECT * FROM rv";
    private final String SQL_BY_ID="SELECT * FROM `rv` WHERE idR=?";


    @Override
    public int insert(Rv rv) {
        int lastInsertId=0;
        database.openConnexion();
        database.initPrepareStatement(SQL_INSERT);
        try {
            database.getPs().setString(1, rv.getLibelleR());
            database.executeUpdate(SQL_INSERT);
            ResultSet rs=database.getPs().getGeneratedKeys();
            if(rs.next()){
            lastInsertId=rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RvDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        database.closeConnexion();
        return lastInsertId;
    }

    @Override
    public int update(Rv ogj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int cancel(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rv> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rv findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
