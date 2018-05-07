package com.example.hello_world_package;

//need not import bean class of Employee because it is in the same directory/package

public class Java_Bean_setting_getting_employee{

    public static void main(String args[]){

        Java_Bean_Employee_Bean e = new Java_Bean_Employee_Bean();//object is created
        //use setter method to set the value
        e.setName("Aashish");
        //use getter method to get the value
        System.out.println("The name of the employee set by you is: " + e.getName());

    }}