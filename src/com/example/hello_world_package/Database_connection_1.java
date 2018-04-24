package com.example.hello_world_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database_connection_1 {
    public static void main(String[] args) {

        try{

            //Get a connection to the db first

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_1", "root", "root");


            //then create a Statement

            Statement statement = connection.createStatement();

            //Then execute the SQL query


            ResultSet resultSet = statement.executeQuery("select * from employee");

            //See the resultset



            while(resultSet.next()){
                System.out.println(resultSet.getString("name")+"," +resultSet.getString("id")+"\n");
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
