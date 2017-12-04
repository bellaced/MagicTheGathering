/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MagicGUI;
//import com.sun.istack.internal.logging.Logger;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.sql.*;
import static java.sql.DriverManager.getConnection;
import javax.management.Query;
/**
 *
 * @author bellaceds
 */
public class Main {

    private Object ex;

        
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MainPage().setVisible(true);
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        CallableStatement cs;
        
    
        try {
            conn = DriverManager.getConnection(
            "jdbc:mysql://localhost/MagicTheGathering?" +
            "user=root&password=BeLLaceds1996");
            // Do something with the connection.
            stmt = conn.createStatement();
        }
        catch (SQLException ex) {
            // Handle any SQL errors.
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());       
    
        }
    }
}