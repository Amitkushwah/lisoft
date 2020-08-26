package myconnection;
import java.sql.*;
public class MyCon { 
    static Connection con=null;
     static
     {
         try
         {      
         Class.forName("com.mysql.jdbc.Driver");
         System.out.println("Driver Load :)");
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
     }
     
     public static Connection mygetConection() throws Exception
     {
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library2","root","root");
           //System.out.println("Connection success");
           return con;
     }
    
}
