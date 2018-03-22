package com.example.hello_world_package;



public class Exception_handling_throws {
    static void divide() throws ArithmeticException{ //divide should be static else cant be accessed from the main function

        //when we know that a method might throw a lind of exception but there is no exception handling mechanism within
        //the method , the caller code must handle this situation i.e., should be caught by the caller part of the code
        int c = 1/0;
    }

    public static void main(String[] args) {
        try{
            divide();
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception CAUGHT");
        }
    }
}
