package com.example.userlogindatabaseweb.repository;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Repository                         // assign this as our repository class for spring
public class TestRepository {

    private String DBurl = "jdbc:mysql://localhost:3306/sampledb"; // db url, change to your own
    private String userName = "root";   // user in db, change to your own
    private String password = "root";   // password, change to your own

    private Connection connection;

    /* constructor that includes setting up the connection,
     has to be instantiated or the method called somewhere(f.ex. in the main method running in UserLogInDatabaseWebApplication) */
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
