package com.example.hello_world_package;

public class Exception_handling_throw_explicit_exception_easy {

    static void validate(int age){
        if(age<18)
            throw new ArithmeticException("Arithmetic Exception thrown as \"Age is below 18\"");
        else
            System.out.println("Eligible to vote");
    }
    public static void main(String args[]){
        validate(14);
        System.out.println("Program execution does not reach here...");
    }
}
