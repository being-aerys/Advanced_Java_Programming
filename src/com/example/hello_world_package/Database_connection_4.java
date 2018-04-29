package com.example.hello_world_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database_connection_4 {


    public static void main(String[] args) {
        try{

            //Get a connection to the db first
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_1", "root", "root");

            //then create a table
            PreparedStatement statement = connection.prepareStatement("create table if not exists student_db_4 (id integer not null, first_name varchar(30), last_name varchar(30))");
            statement.execute();

            //insert data

            String insertion_string_1 = "insert into student_db_4" + " (id, first_name, last_name)"
                    + " values ('1','Aashish', 'Adhikari')";
            String insertion_string_2 = "insert into student_db_4 " + " (id, first_name, last_name)"
                    + " values ('2','Abinash', 'Neupane')";
            String insertion_string_3 = "insert into student_db_4 " + " (id, first_name, last_name)"
                    + " values ('3','Amit', 'Bhattarai')";
            String insertion_string_4 = "insert into student_db_4 " + " (id, first_name, last_name)"
                    + " values ('4','Anjana', 'Shrestha')";
            String insertion_string_5 = "insert into student_db_4 " + " (id, first_name, last_name)"
                    + " values ('5','Babu', 'Neupane')";

            statement.executeUpdate(insertion_string_1);
            statement.executeUpdate(insertion_string_2);
            statement.executeUpdate(insertion_string_3);
            statement.executeUpdate(insertion_string_4);
            statement.executeUpdate(insertion_string_5);

            //see the result set

            PreparedStatement p = connection.prepareStatement("select * from student_db_4",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = p.executeQuery();




            //lets see the information first
            while(resultSet.next()){
                System.out.println(resultSet.getString("first_name")+"," + resultSet.getString("last_name")+"," + resultSet.getString("id")+"\n");


            }

            //lets scroll through the result set of the scrollable result set

            resultSet.absolute(3); //this moves our cursor to the 3rd row of the resultSet
            //lets see the information of the 3rd row

            System.out.println("The information at the 3rd row is \n");
            System.out.println(resultSet.getString("first_name")+" is the first name at the 3rd row.");

            //lets move one row forward as

            resultSet.relative(1);
            System.out.println("The information at the 4th row is \n");
            System.out.println(resultSet.getString("first_name")+" is the first name at the 4th row.");

            //lets go back 1 row as
            resultSet.relative(-1);
            System.out.println("The information at the 3rd row is \n");
            System.out.println(resultSet.getString("first_name")+" is the first name at the 3rd row.");

            //lets go to the first row as
            resultSet.first();
            System.out.println("The information at the 1st row is \n");
            System.out.println(resultSet.getString("first_name")+" is the first name at the 1st row.");

            //lets go to the next row as
            resultSet.next();
            System.out.println("The information at the 2nd row is \n");
            System.out.println(resultSet.getString("first_name")+" is the first name at the 2nd row.");

            //lets go to the previous row as
            resultSet.previous();
            System.out.println("The information at the previous row i.e., 1st row is \n");
            System.out.println(resultSet.getString("first_name")+" is the first name at the 1st row.");



        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
