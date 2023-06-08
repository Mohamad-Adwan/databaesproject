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
public class tables {
    public static void main(String argc[]){
        
        Connection con=null;
        Statement st=null;
        try{
        con=ConnectionProvider.getCon();
        st=con.createStatement();
        
       st.executeUpdate("select * from USERS");
       st.executeUpdate("select * from EMPLOYEES");
       st.executeUpdate("select * from BOOK");
       st.executeUpdate("select * from RULE");
       st.executeUpdate("select * from CUSTOMER");
       st.executeUpdate("select * from ROOM");
       JOptionPane.showMessageDialog(null, "Connected Sucssfuly");
        /*st.executeUpdate("create table users(name varchar2(200),email varchar2(200),password varchar2(50),sucurityQuestion varchar2(500),answer varchar2(200),"
                + "adrress varchar2(200),status varchar2(20)");
        
        st.executeUpdate("create table room(roomNo int,roomType varchar2(200),bed varchar2(200), price int ,status varchar2(20))");
        
        st.executeUpdate("create table customer(id int ,name varchar2(200),numbermobile varchar2(20),Nationality varchar2(200) ,gendar varchar2(50),"
                + "email varchar2(200),idp varchar2(200),address varchar2(500),checkin varchar2(50), roomnu int, bed varchar(200),roomType varchar(200),"
                + "priceperday int,numberofdays int,totalamount varchar(200),checkout varchar(50))");
        
        st.executeUpdate("create table Employees(name varchar2(200),lastname varchar2(200),mobliephone int, varchar2(200)email varchar2(200),password varchar2(200),"
                + "sucurityQuestion varchar2(500),answer varchar2(200),adrress varchar2(200)");
        
        st.executeUpdate("create table Book(bookID int,bookType varchar2(200),bookdescribed varchar2(200))");
        
        st.executeUpdate("create table rule(RuleNo int,RuleTopic varchar2(200),RuleDescribed varchar2(800)");
        JOptionPane.showMessageDialog(null, "Table created successfully");*/
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        System.out.println(e);
        }
        finally{
    try{
    
    
    con.close();
    st.close();
    }   
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    } 
        }
    }
    

