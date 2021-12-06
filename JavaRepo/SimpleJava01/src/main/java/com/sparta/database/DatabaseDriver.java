package com.sparta.database;

import java.sql.*;

public class DatabaseDriver {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "alex", "password123");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from actor");
            while(resultSet.next()){
                System.out.println("Name: " + resultSet.getString("First_Name")
                                   + " " + resultSet.getString("Last_Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
