package com.sparta.jdbc;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;

public class JDBCDriver {
    public static void main(String[] args) {
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            connection = ConnectionFactory.getConnection();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Connection object " + connection);
        Statement statement = null;
        printActors(connection);
        try {
            createNewActor("neil", "weightman");
            createNewActor("neilsdas", "weightmandsadsa");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createNewActor(String fname, String lname) throws SQLException, IOException {
        PreparedStatement statement = StatementFactory.getInsertStatement();
        statement.setString(1, fname);
        statement.setString(2, lname);
        try {
            int rowsAffected = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printActors(Connection connection) {
        ResultSet resultSet;
        Statement statement;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from actor");
            while(resultSet.next()){
                System.out.println("Name: " + resultSet.getString("first_name")+ " " +
                                    resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
