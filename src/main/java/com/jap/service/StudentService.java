/*
 * Author Name: M Jaya Suriya
 * Date: 9/18/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.jap.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentService {
    private static final String URL = "jdbc:mysql://localhost:3306/school";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private Connection connection;

    public StudentService() {
        connection = null;
    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public void printConnectionStatus() {
        if (connection != null) {
            System.out.println("Database is connected ");
        } else {
            System.err.println("Database is not connected ");
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
