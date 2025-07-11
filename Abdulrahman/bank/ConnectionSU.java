package Abdulrahman.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class ConnectionSU {
    Connection connection;
    Statement statement;
    public ConnectionSU(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","abdul#123");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}