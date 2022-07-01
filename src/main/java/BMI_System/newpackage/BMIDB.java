/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI_System.newpackage;

import BMI_System.ConnectionJava;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class BMIDB {
    private static Connection conn = ConnectionJava.Get_Connection();
    public static List<String> getData(double x){
        List<String> dataSET = new ArrayList<>();
        try {
            String sql = "select About_health, Foods from HealthDetails where cryteria = 18.5 ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(sql);
            while(rs.next()){
                
            dataSET.add(rs.getString("About_health"));
            dataSET.add(rs.getString("Foods"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        List<String> dataSET2 = new ArrayList<>();
        try {
            String sql = "select About_health, Foods from HealthDetails where cryteria = 24.9 ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(sql);
            while(rs.next()){
                
            dataSET.add(rs.getString("About_health"));
            dataSET.add(rs.getString("Foods"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        List<String> dataSET3 = new ArrayList<>();
        try {
            String sql = "select About_health, Foods from HealthDetails where cryteria = 29.9 ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(sql);
            while(rs.next()){
                
            dataSET.add(rs.getString("About_health"));
            dataSET.add(rs.getString("Foods"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        List<String> dataSET4 = new ArrayList<>();
        try {
            String sql = "select About_health, Foods from HealthDetails where cryteria = 31 ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(sql);
            while(rs.next()){
                
            dataSET.add(rs.getString("About_health"));
            dataSET.add(rs.getString("Foods"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return dataSET;
    }
}
