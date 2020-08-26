package dao;
import java.sql.*;
import myconnection.MyCon;
public class LoginDao
{
     public static boolean checkLogin(String user,String pass) throws Exception
    {
          Connection con=null;
          PreparedStatement ps=null;
          ResultSet rs=null;
          con=MyCon.mygetConection();
          String sql;
          sql="select * from login where  username=? and password=?";
          ps=con.prepareStatement(sql);
          ps.setString(1, user);
          ps.setString(2, pass);
          rs=ps.executeQuery();
          if(rs.next())
           return true;
          
          return false;
               
    }
}
