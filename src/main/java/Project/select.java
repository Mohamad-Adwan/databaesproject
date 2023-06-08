/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
import javax.swing.JOptionPane;
      
/**
 *
 * @author lenovo
 */
public class select {
    public static ResultSet getData(String Query){
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    try{
     con=ConnectionProvider.getCon();
        st=con.createStatement();
        rs=st.executeQuery(Query);
        return rs;
    
    
    
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        System.out.println(e);
    return null;}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
