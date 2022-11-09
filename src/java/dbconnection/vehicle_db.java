
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class vehicle_db {
    
    
    public static void main(String[] args) throws ClassNotFoundException{
        
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle?useSSL=false","root","sliitpc16$97");
            if(conn != null){
                    System.out.println("Database Connected Successfully !");
                            }
        }catch(SQLException e){
                    System.out.println(e);
                           }
        
        
    }

   
}
        
    
    