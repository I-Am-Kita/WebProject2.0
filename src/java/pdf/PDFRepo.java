/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfPCell;
import db.DbConnection;
import java.io.IOException;
import static java.lang.System.out;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ROBIN
 */
public class PDFRepo {
    
  public List<String> getListOfItems(int num,String table){
    List<String> list = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM "+table+" WHERE "+table+".num='"+num+"'");
        System.out.println(connection);
    while(data.next()){
        list.add(data.getString(3));
        list.add("              ");
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return list;
}     

 public String getListToString(List<String> list){
 String record ="";
 for(String item : list){
 record = record + item; 
 }
 return record;
 }

public static PdfPCell createImageCell(String path) throws DocumentException, IOException {
    Image img = Image.getInstance(path);
    PdfPCell cell = new PdfPCell(img, true);
    return cell;
    }

 
public List<String> investigationReport1(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(3));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}
public List<String> investigationReport2(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(4));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport3(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(5));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport4(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(6));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport5(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(7));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport6(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(8));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport7(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(9));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport8(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(10));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport9(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(11));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport10(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(12));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport11(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(13));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport12(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(14));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport13(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(15));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport14(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(16));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport15(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(17));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport16(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(18));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport17(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(19));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport18(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(20));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport19(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(21));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport20(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(22));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport21(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(23));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport22(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(24));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport23(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(25));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport24(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(26));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport25(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(27));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport26(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(28));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport27(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(29));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport28(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(30));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport29(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(31));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport30(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(32));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport31(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(33));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport32(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(34));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport33(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(35));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport34(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(36));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport35(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(37));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport36(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(38));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport37(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(39));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}public List<String> investigationReport38(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(40));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}

public List<String> investigationReport39(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(41));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}

public List<String> investigationReport40(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(42));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}

public List<String> investigationReport41(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(43));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}

public List<String> investigationReport42(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(44));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
      return patientList;
      
}

public List<String> bloodGasAnalysisReport1(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(3));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}   

public List<String> bloodGasAnalysisReport2(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(4));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 

public List<String> bloodGasAnalysisReport3(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(5));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 

public List<String> bloodGasAnalysisReport4(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(6));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 

public List<String> bloodGasAnalysisReport5(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(7));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 

public List<String> bloodGasAnalysisReport6(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(8));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 

public List<String> bloodGasAnalysisReport7(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(9));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 

public List<String> bloodGasAnalysisReport8(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(10));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 

public List<String> bloodGasAnalysisReport9(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(11));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 

public List<String> bloodGasAnalysisReport10(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(12));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 

public List<String> bloodGasAnalysisReport11(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(13));
        
    }
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 

     public String current_problems(int id) throws SQLException{    //get details of the patient
    String current = null;
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM problems WHERE problems.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        current =data.getString(3);
        
    }
    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return current;
}

     public String past_problems(int id) throws SQLException{    //get details of the patient
    String past = null;
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM problems WHERE problems.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        past = data.getString(4);
        
    }
    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return past;
}     
     
     
}
