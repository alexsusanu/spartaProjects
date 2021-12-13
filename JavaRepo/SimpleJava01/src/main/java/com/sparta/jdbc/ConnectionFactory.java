package com.sparta.jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    private static Connection theConnection = null;
    public static Connection getConnection() throws IOException, SQLException {
        if(theConnection == null) {
            Properties properties = new Properties();
            properties.load(new FileReader("connection.properties"));
            String url = properties.getProperty("dburl");
            String userId = properties.getProperty("dbuser");
            String password = properties.getProperty("dbpassword");
            theConnection = DriverManager.getConnection(url, userId, password);
        }
        return theConnection;
    }
}
