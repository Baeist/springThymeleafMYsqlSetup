package com.example.userlogindatabaseweb.repository;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Repository                         // assign this as out repository class for spring
public class TestRepository {

    private String DBurl = "jdbc:mysql://localhost:3306/sampledb"; // db url
    private String userName = "root";   // user
    private String password = "8089";   // password

    private Connection connection;

    // constructor that includes setting up the connection
    TestRepository(){
        setConnection();
    }

    // basic database connection
    public void setConnection(){
        try{
            connection = DriverManager.getConnection(DBurl, userName, password);
        }
        catch(SQLException s){
            System.out.println("Could not connect to database " + s);
        }
    }




}
