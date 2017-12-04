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
import javax.management.Query;
/**
 *
 * @author bellaceds
 */
public class Main {

    private Object ex;


    public Connection getConnection() {
        Connection conn = null; 
        
        try{
           conn = DriverManager.getConnection("jdbc:mysql://localhost/magicthegathering", "root", "");
           //System.out.println("Connected");
           
        }catch(SQLException e){
           Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
        
    /*public static void main(String[] args) {
        // TODO code application logic here
       new MainPage().setVisible(true);
       
       Connection conn = null;
       
       try{
           conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
           System.out.println("Connected");
           
       }catch(SQLException e){
           System.err.println(e);
       }
    }
 */  
    }
}