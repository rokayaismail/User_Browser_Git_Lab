/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rokaya.salma.userbrowser.model;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author rokaya
 */
public class DB_Connection {

    private static Connection connection = null;

    private DB_Connection() {
        DataSource source = DataSourceFactory.getOracleDataSource();
        try {
            connection = source.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            new DB_Connection();
        }
        return connection;
    }

}
