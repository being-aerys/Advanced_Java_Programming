package com.example.hello_world_package;

import java.sql.*;

public class Database_connection_3 {
    public static void main(String[] args) {
        try{

            //Get a connection to the db first
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_1", "root", "root");

            //then create a table
            PreparedStatement statement = connection.prepareStatement("create table if not exists student_db (id integer not null, first_name varchar(30), last_name varchar(30), primary key (id))");
            statement.execute();

            //insert data

            String insertion_string_1 = "insert into student_db" + " (id, first_name, last_name)"
                    + " values ('1','Aashish', 'Adhikari')";

            String insertion_string_2 = "insert into student_db " + " (id, first_name, last_name)"
                    + " values ('2','Abinash', 'Neupane')";

            String insertion_string_3 = "insert into student_db " + " (id, first_name, last_name)"
                    + " values ('3','Amit', 'Bhattarai')";
            String insertion_string_4 = "insert into student_db " + " (id, first_name, last_name)"
                    + " values ('4','Anjana', 'Shrestha')";
            String insertion_string_5 = "insert into student_db " + " (id, first_name, last_name)"
                    + " values ('5','Babu', 'Neupane')";

            statement.executeUpdate(insertion_string_1);
            statement.executeUpdate(insertion_string_2);
            statement.executeUpdate(insertion_string_3);
            statement.executeUpdate(insertion_string_4);
            statement.executeUpdate(insertion_string_5);

            //see the result set

            PreparedStatement p = connection.prepareStatement("select * from student_db",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = p.executeQuery();


            while(resultSet.next()){
                System.out.println(resultSet.getString("first_name")+"," + resultSet.getString("last_name")+"," + resultSet.getString("id")+"\n");
                String str = resultSet.getString("first_name");
                System.out.println("Previous person name on this row is "+str);
                resultSet.updateString("first_name","Johny");
                //invoke updateRow() method to finish the update
                resultSet.updateRow();
            }

            //Now lets check if we have changed the actual value in the database table using updatable resultset or not

            PreparedStatement p1 = connection.prepareStatement("select * from student_db");
            ResultSet re = p1.executeQuery();
            while(re.next()){
                System.out.println(re.getString("first_name")+"," + re.getString("last_name")+"," + re.getString("id")+"\n");

            }

            //As you can see, changes made using updatable resultset are made in the actual db as well

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
