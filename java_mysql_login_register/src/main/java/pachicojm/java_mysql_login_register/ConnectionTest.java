/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pachicojm.java_mysql_login_register;

import java.sql.Connection;

/**
 *
 * @author lokod
 */
import java.sql.Connection;

public class ConnectionTest {
    public static void main(String[] args) {
        Connection connection = myConnection.getConnection();
        
        if (connection != null) {
            System.out.println("Connection successful!");
            // Additional code to perform database operations
        } else {
            System.out.println("Connection failed!");
        }
    }
}
