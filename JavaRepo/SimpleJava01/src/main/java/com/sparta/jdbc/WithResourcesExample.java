package com.sparta.jdbc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class WithResourcesExample {
    public static void main(String[] args) throws SQLException, IOException {
        Properties properties = null;
        String url, userId, password;
        try(FileReader propertiesFile = new FileReader("connection.properties")) {
            properties = new Properties();
            properties.load(propertiesFile);
            url = properties.getProperty("dburl");
            userId = properties.getProperty("dbuser");
            password = properties.getProperty("dbpassword");
            Connection theConnection = DriverManager.getConnection(url, userId, password);

            Statement statement = theConnection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from actor where actor_id=200");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("first_name"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
