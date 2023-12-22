/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author assi
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    // URL to connect to the database. Modify the database name, host, and port as necessary.
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/blanchisserie";
    // Username for the database. Replace with your database username.
    private static final String USERNAME = "root";
    // Password for the database. Replace with your database password.
    private static final String PASSWORD = "";

    // Static block to register the MySQL JDBC driver.
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            // Handle the error here
        }
    }

    // Method to establish and get the database connection.
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
    }
}

