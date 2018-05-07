package com.example.hello_world_package;

public class Java_Bean_Employee_Bean implements java.io.Serializable{

    private int id;
    private String name;

    //No-argument constructor
    public Java_Bean_Employee_Bean(){}

    //setter method
    public void setId(int id_number){this.id=id_number;}

    //getter method
    public int getId(){return id;}

    public void setName(String emp_name){this.name=emp_name;}

    public String getName(){return name;}

}