 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rokaya.salma.userbrowser.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author rokaya
 */
public class DataSourceFactory {

    public static OracleDataSource getOracleDataSource() {
        Properties properties = new Properties();
        InputStream stream = null;
        OracleDataSource dataSource = null;
        try {
            stream = new FileInputStream("db.properties");
            properties.load(stream);
            dataSource = new OracleDataSource();
            dataSource.setURL(properties.getProperty("DB_URL"));
            dataSource.setUser(properties.getProperty("SQL_USER"));
            dataSource.setPassword(properties.getProperty("SQL_PASS"));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataSourceFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataSourceFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataSourceFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataSource;
    }
}
