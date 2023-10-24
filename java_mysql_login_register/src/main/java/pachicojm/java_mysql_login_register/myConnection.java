/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pachicojm.java_mysql_login_register;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author lokod
 */
public class myConnection {
    
    // function to connect to mysql
    public static Connection getConnection(){
        Connection con = null;
        String jdbc_url = "jdbc:mysql://127.0.0.1/ld_company";
        String username = "root";
        String password = "";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(jdbc_url,username, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return con;
    }
}
