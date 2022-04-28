/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tmsproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author Alexandre
 */
public class TMSProject extends javax.swing.JFrame{

    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/tms database";
        String username = "TMS_User";
        String password = "TMS2022";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Successfull" + url);
            
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
        
    }//END main() method
}