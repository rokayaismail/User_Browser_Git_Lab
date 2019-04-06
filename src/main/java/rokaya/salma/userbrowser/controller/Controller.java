/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rokaya.salma.userbrowser.controller;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import rokaya.salma.userbrowser.model.User;
import rokaya.salma.userbrowser.model.dao.UsersDAO;

/**
 *
 * @author rokaya
 */
public class Controller {
    //salma 

    //rokaya
    
    private UsersDAO dao;

    public Controller() {
        dao = new UsersDAO();
        
    }

    public User getNextUser() {
        
        return dao.getNextUser();
    }

    public User getLastUser() {
        
        return dao.getLastUser();
    }

    public User getPrevUser() {
        
        return dao.getPrevUser();
    }

    public User getFirstUser() {
        return dao.getFirstUser();
    }
    public void deleteCurrentUser(){
        dao.deleteUser();
    }
    
    public void insertUser(User user){
        dao.addUser(user);
    }
    
    public void updateCurrentUser(User user){
        dao.updateUser(user);
    }
}
