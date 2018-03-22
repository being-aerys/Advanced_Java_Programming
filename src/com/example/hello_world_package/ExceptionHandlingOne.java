package com.example.hello_world_package;

public class ExceptionHandlingOne {
    public static void main(String[] args) {
        int a,b,c;
        a=1;
        b=1;
        try{


            System.out.println("Inside TRY block");

            c = 1/(a-b);
            System.out.println("If this is printed, then your code did not throw exception.");


        }
        catch (ArithmeticException e){
            System.out.println("Threw ArithmeticException");
        }
    }
}
