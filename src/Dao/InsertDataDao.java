package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import myconnection.MyCon;
import model.Data;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class InsertDataDao
{
 public static boolean insertData(Data D)throws Exception
 {
     Connection con=null;
     PreparedStatement ps=null;
     con=MyCon.mygetConection();
     String sql;
     sql="insert into student_info values(?,?,?,?)";
     ps=con.prepareStatement(sql);
     ps.setString(1,D.getBt());
     ps.setString(2,D.getSnmae());
     ps.setString(3,D.getEn());
     ps.setString(4,D.getBranch());
     if(ps.executeUpdate()>0)
         return true;
     else
         return false;
 }
 public boolean update_student(Data D)throws Exception    
     {
            Connection con=null;
            PreparedStatement ps=null;
            con=MyCon.mygetConection();
            String sql;
            sql="update student_info set sname=?,eroll=?,Branch=? where BTno=?";
            ps=con.prepareStatement(sql);           
            ps.setString(1,D.getSnmae());
            ps.setString(2,D.getEn());
            ps.setString(3,D.getBranch());
            ps.setString(4,D.getBt());
            if(ps.executeUpdate()>0)
                return true;
            else
              return false;  
     } 
  public boolean deleteByBTno(String BTno) throws Exception
     {
             Connection con=null;
            PreparedStatement ps=null;
            con=MyCon.mygetConection();
            String sql;
            sql="delete from student_info where BTno=?";
            ps=con.prepareStatement(sql);
            int n=0;
            ps.setString(1, BTno);
            n=ps.executeUpdate();
            if(n>0)
                return true;
            else 
                return false;
     }
 public static Data searchByBtno(String str)throws Exception
 {
     Connection con=null;
     PreparedStatement ps=null;
     con=MyCon.mygetConection();
     ResultSet rs=null;
     String sql;
     sql="select * from student_info where btno=?";
     ps=con.prepareStatement(sql);
     ps.setString(1,str);
     Data D=new Data();
     rs=ps.executeQuery();
     if(rs.next())
     {
         D.setBt(rs.getString(1));
         D.setSnmae(rs.getString(2));
         D.setEn(rs.getString(3));
         D.setBranch(rs.getString(4));
     }
     else
         D=null;
     return D;
 }
 public static boolean insertDataEntryPage(Data D)throws Exception
 {
     Connection con=null;
     PreparedStatement ps=null;
     con=MyCon.mygetConection();
     String sql;
     sql="insert into studententrydata values(?,?,?,?,?,?,?,?)";
     ps=con.prepareStatement(sql);
     java.sql.Date sDate=convertUtilToSql(D.getDate2());
     ps.setInt(1, D.getSno());
     ps.setDate(2,sDate);
     ps.setString(3,D.getBt());
     ps.setString(4,D.getSnmae());
     ps.setString(5,D.getEn());
     ps.setString(6,D.getBranch());
     ps.setString(7,D.getTimein());
     ps.setString(8,D.getTimeout());
     if(ps.executeUpdate()>0)
         return true;
     else
         return false;
 }
 public boolean updateData(Data D)throws Exception    
     {
            Connection con=null;
            PreparedStatement ps=null;
            con=MyCon.mygetConection();
            String sql;
            sql="update studententrydata set Name=?,Eroll=?,Branch=?,Time_in=?,Time_out=? where BTno=? AND Date=? And Sno=?";
            ps=con.prepareStatement(sql);
            java.util.Date date=new java.util.Date();         
            java.sql.Date sqlDate=new java.sql.Date(date.getTime());
            ps.setString(1, D.getSnmae());
            ps.setString(2, D.getEn());
            ps.setString(3, D.getBranch());
            ps.setString(4, D.getTimein());
            ps.setString(5,D.getTimeout());
            ps.setString(6,D.getBt());
            ps.setDate(7,sqlDate);
            ps.setInt(8, D.getSno());
            if(ps.executeUpdate()>0)
                return true;
            else
              return false;
            
     }   
  public static Data searchByBtnoAndDate(String str)throws Exception
 {
      Connection con=null;
     PreparedStatement ps=null;
     con=MyCon.mygetConection();
     ResultSet rs=null;
     java.util.Date date=new java.util.Date();         
     java.sql.Date sqlDate=new java.sql.Date(date.getTime());
     String sql;
     sql="select * from studententrydata where btno=? and Date=?";
     ps=con.prepareStatement(sql);
     ps.setString(1,str);
     ps.setDate(2,sqlDate);
     Data D=new Data();
     rs=ps.executeQuery();
     if(rs.last())
     {
         D.setSno(rs.getInt(1));
         D.setDate2(rs.getDate(2));
         D.setBt(rs.getString(3));
         D.setSnmae(rs.getString(4));
         D.setEn(rs.getString(5));
         D.setBranch(rs.getString(6));
         D.setTimein(rs.getString(7));
         D.setTimeout(rs.getString(8));
     }
     else
         D=null;
     return D;
 }
  public int Sno()throws Exception
            {
                Connection con=null;
                PreparedStatement ps=null;
                con=MyCon.mygetConection();
                ResultSet rs=null,rs1=null;
                String sql,sql1;
                Date D=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
                java.util.Date date=new java.util.Date();         
                java.sql.Date sqlDate=new java.sql.Date(date.getTime());
                //System.out.println(sdf.format(D));
                sql="select Date from studententrydata";
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                int n=1;
                rs.last();
                D=rs.getDate(1);            
                if(sdf.format(D).compareTo(sdf.format(sqlDate))==0)
                {
                     sql1="select max(sno) from studententrydata where Date=?";
                     ps=con.prepareStatement(sql1);
                     ps.setDate(1,sqlDate);
                     rs1=ps.executeQuery();
                    if(rs1.next())
                   {
                         n=rs1.getInt(1);
                         n=n+1;
                   } 
                   
                }   
                 return(n);
     }
  public static java.sql.Date convertUtilToSql(java.util.Date uDate)
  {
      java.sql.Date sDate=new java.sql.Date(uDate.getTime());
      return sDate;
  }
   

}
