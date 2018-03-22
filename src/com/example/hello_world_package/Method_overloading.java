package com.example.hello_world_package;

import java.util.Scanner;

public class Method_overloading {
    public static void main(String[] args){
        System.out.print("Which geometrical shape's area do you want?\nEnter 1 for rectangle\nEnter 2 for circle");
        Scanner scanner = new Scanner(System.in);
        int shape = scanner.nextInt();
        Area a = new Area();


        if(shape == 1){
            System.out.println("Enter length and breadth");
            int length = scanner.nextInt();
            int breadth = scanner.nextInt();
            System.out.println("The area of rectangle is"+a.area_calc(length,breadth));
        }

        else if (shape == 2){
            System.out.println("Enter the radius of the circle");
            int radius = scanner.nextInt();

            System.out.println("The area of rectangle is"+a.area_calc(radius));
        }
        else{
            System.out.println("Your input is invalid");
        }

        //close reader to avoid resource leak
        scanner.close();


    }
}

class Area{

    float area_calc(int x, int y){
        return(x *y);
    }

    float area_calc(int x){
        return((float)3.14*x*x);
    }
}
