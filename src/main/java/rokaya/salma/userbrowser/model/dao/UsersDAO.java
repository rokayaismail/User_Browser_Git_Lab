/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rokaya.salma.userbrowser.model.dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import rokaya.salma.userbrowser.model.DB_Connection;

/**
 *
 * @author rokaya
 */
public class UsersDAO {

//    private Statement statement = null;
    private CachedRowSet set = null;

    public UsersDAO() {
        try {
            set = (RowSetProvider.newFactory()).createCachedRowSet();
            int key[]={1};
            set.setKeyColumns(key);
//            DataSource source = DataSourceFactory.getOracleDataSource();
            set.setDataSourceName("db.properties");
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public CachedRowSet getAllUsers() {
        try {
            set.setCommand("select u.id,u.fname,u.mname,u.lname,u.email,u.phone from users u");
            set.execute(DB_Connection.getConnection());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return set;
    }

}
