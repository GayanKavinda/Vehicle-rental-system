/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Prasad Chathuranga
 */
public class db {
    
    
    public static void main(String[] args) throws ClassNotFoundException{
        
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payments?useSSL=false","root","sliitpc16$97");
            if(conn != null){
                    System.out.println("Database Connected Successfully !");
                            }
        }catch(SQLException e){
                    System.out.println(e);
                           }
        
        
    }

   
}
        
    
    