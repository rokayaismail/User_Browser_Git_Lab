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
    private CachedRowSet set;
    private UsersDAO dao;

    public Controller() {
        dao = new UsersDAO();
        set = dao.getAllUsers();
    }

    public User getNextUser() {
        User user=null;
        try {
            if (set.next()) {
                user = new User(set.getInt("ID"), set.getString("FNAME"),
                        set.getString("MNAME"), set.getString("LNAME"), set.getString("EMAIL"), set.getString("PHONE"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return user;
    }

    public User getLastUser() {
        User user=null;
        try {
            if (set.last()) {
                user = new User(set.getInt("ID"), set.getString("FNAME"),
                        set.getString("MNAME"), set.getString("LNAME"), set.getString("EMAIL"), set.getString("PHONE"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return user;
    }

    public User getPrevUser() {
        User user=null;
        try {
            if (set.previous()) {
                user = new User(set.getInt("ID"), set.getString("FNAME"),
                        set.getString("MNAME"), set.getString("LNAME"), set.getString("EMAIL"), set.getString("PHONE"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return user;
    }

    public User getFirstUser() {
        User user=null;
        try {
            if (set.first()) {
                user = new User(set.getInt("ID"), set.getString("FNAME"),
                        set.getString("MNAME"), set.getString("LNAME"), set.getString("EMAIL"), set.getString("PHONE"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return user;
    }

}
