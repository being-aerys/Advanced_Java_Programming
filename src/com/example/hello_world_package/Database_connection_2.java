package com.example.hello_world_package;

import java.sql.*;

public class Database_connection_2 {
    public static void main(String[] args) {

        try{


            //Get a connection to the db first

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_1", "root", "root");


            //then create a table


            Statement statement = connection.createStatement();
            String creation_string = "create table if not exists student_details(id integer not null, first_name varchar(30), last_name varchar(30), primary key (id))";
            statement.executeUpdate(creation_string);



            //insert data

            String insertion_string_1 = "insert into student_details " + " (id, first_name, last_name)"
                    + " values ('1','Aashish', 'Adhikari')";

            String insertion_string_2 = "insert into student_details " + " (id, first_name, last_name)"
                   + " values ('2','Abinash', 'Neupane')";

             statement.executeUpdate(insertion_string_1);
             statement.executeUpdate(insertion_string_2);

             //see the result set

             ResultSet resultSet = statement.executeQuery("select * from student_details");


             while(resultSet.next()){
                System.out.println(resultSet.getString("first_name")+"," + resultSet.getString("last_name")+"," + resultSet.getString("id")+"\n");
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
