package rentvideo;

import java.sql.*;
import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class DBAccess {
    private Connection con;
    private Statement stmt;
    public DBAccess(){
        try{
            MyConnection myCon = new MyConnection();
            con = myCon.getConnection();
            stmt = con.createStatement();
        }catch(Exception ex){
            
        }
    }
    
    public int Update(String str){
        try{
            System.out.println(str);
            int i = stmt.executeUpdate(str);
            return i;
        }catch(Exception ex){
            return -1;
        }
    }
    
    public ResultSet Query(String str){
        try{
            ResultSet rs = stmt.executeQuery(str);
            return rs;
        }catch(Exception ex){
            return null;
        }
    }
}
