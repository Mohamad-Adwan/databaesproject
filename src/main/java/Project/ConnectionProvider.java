/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author lenovo
 */
public class ConnectionProvider {
    public static Connection getCon(){
    
    try{
     //    System.out.println("project1.tables.main()");
    Class.forName("oracle.jdbc.driver.OracleDriver");
    //System.out.println("hello1");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");
   //System.out.println("hello2");
    return con;
    }
    catch(Exception e){
    //    System.out.println("hello");
    return null;
    
    
    }
    
    
    }
}
