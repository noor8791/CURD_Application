package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DBConnection {
   public static Connection getConnection(){
       Connection con = null;

       String url = "jdbc:mysql://localhost:3306/curd_application";
       String user = "root";
       String pass = "";

       try{
           Class.forName("com.mysql.cj.jdbc.driver");
           con = DriverManager.getConnection(url,user,pass);
       } catch (Exception e) {
           System.out.println("Error  "+e.getMessage());
       }
       return con;
   }
}