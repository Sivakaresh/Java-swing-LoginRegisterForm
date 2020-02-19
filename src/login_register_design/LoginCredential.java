/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_register_design;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karesh Retnam
 */
public class LoginCredential {

    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "hotel_reservation";
    private static Integer portnumber = 3306;
    private static String password = "";

    public static Connection getConnection() {
        Connection cnx = null;

        MysqlDataSource datasource = new MysqlDataSource();
 
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);

        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection - > " + LoginCredential.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cnx;
    }

}
