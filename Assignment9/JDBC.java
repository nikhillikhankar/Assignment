/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newassgnment;

/**
 *
 * @author SONY
 */
import java.sql.*;

public class JDBC {

 static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
 static final String DB_URL = "jdbc:mysql://localhost:3306/STUDENT";
 static final String USER = "root";
 static final String PASS = "";

 public static void main(String[] args)
{
 Connection conn = null;
 Statement stmt = null;
 
 try
    {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connect to a selected database...");
 
         conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connect database successfully...");
            System.out.println("Insert records into the table...");
 
        stmt = conn.createStatement();
 
        String sql = "INSERT INTO `student`(`rollno`, `name`,`marks`, `percentage`) VALUES ('20', 'sam', '701','93.47%')";

        stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
    }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(stmt!=null)
                    conn.close();
            }
            
            catch(SQLException se)
            {
            }// do nothing
        
            try
            {
                if(conn!=null)
                conn.close();
            }
            catch(SQLException se)
            {
                se.printStackTrace();
            }
        }
            
                System.out.println("Have a good day! ");
}
}