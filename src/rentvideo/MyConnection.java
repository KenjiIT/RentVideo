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
public class MyConnection {
    public Connection getConnection() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;Database=RentVideo;user=thang;password=123;encrypt=true;trustServerCertificate=true;";
            Connection con = DriverManager.getConnection(url);
            return con;  
        } catch (ClassNotFoundException | SQLException ex) {
        JOptionPane.showMessageDialog(null, ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        return null;  
    }
}
}
