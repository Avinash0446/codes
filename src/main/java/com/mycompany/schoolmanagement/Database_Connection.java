/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schoolmanagement;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ISHA
 */
public class Database_Connection {
    public static  Connection createCommection()
  {
Connection con=null;
  try
 { Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school_management","root","");
System.out.println("Connection established");
} 
catch(Exception e)  
{
System.out.println("error"+e.toString());
}
return con;
}
    
}
