/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI_System;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class ConnectionJava {
    private static Connection conn = null;
    private static final String url = "jdbc:ucanaccess://C:/Users/Administrator/Desktop/HealthApp/HealthAppDB.accdb";
    
    
    public static Connection Get_Connection(){
        try {
            conn = DriverManager.getConnection(url);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    return conn;
    }
    
    
}


