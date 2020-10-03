/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author viett
 */
public class DBConnection {
    static final String DB_URL = "jdbc:mysql://localhost:3306/tudu?zeroDateTimeBehavior=convertToNull";
    static final String USER = "root";
    static final String PASS = "123456";
    
    public static Connection connectDB(){
        Connection conn = null;

        try {
            // Dont need this for newer JDK version
            Class.forName("com.mysql.jdbc.Driver");
            
            //Open connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            System.out.println("in DB connection");
            
            return conn;
            
        } catch (Exception ex) {
            System.out.println("Error connecting to DB");
            return null;
        }
    }
}
