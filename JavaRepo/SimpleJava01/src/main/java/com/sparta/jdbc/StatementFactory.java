package com.sparta.jdbc;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StatementFactory {
    private static PreparedStatement insertStatement = null;
    public static PreparedStatement getInsertStatement() throws SQLException, IOException {
        if(insertStatement == null){
            insertStatement = ConnectionFactory.getConnection()
                                               .prepareStatement(
                                           "INSERT into actor(first_name, last_name) values (?,?)");
        }
        return insertStatement;
    }
}
