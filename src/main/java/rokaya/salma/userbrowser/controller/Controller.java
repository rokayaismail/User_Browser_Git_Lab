/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rokaya.salma.userbrowser.controller;

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
    private CachedRowSet set;
    private UsersDAO dao;
    public Controller() {
        dao = new UsersDAO();
        set =dao.getAllUsers();
    }
    public User getNextUser(){
        return null;
    } 
    public User getLastUser(){
        return null;
    } 
    public User getPrevUser(){
        return null;
    } 
    public User getFirstUser(){
        return null;
    } 
}
