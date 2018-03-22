package com.example.hello_world_package;

import java.util.Scanner;

public class Inheritance_demo_using_house {
    public static void main (String[] args){
        Bedroom r1 = new Bedroom();
        System.out.println("Enter the length, breadth, and height of the bedroom.");
        Scanner scanner = new Scanner(System.in);
        r1.length = scanner.nextInt();
        r1.breadth = scanner.nextInt();
        r1.height = scanner.nextInt();
        System.out.println("The price of house is "+ r1.price());
        System.out.println("The volume of the house is "+ r1.volume());
        scanner.close();
    }
    }



    class Room{
        int length,breadth;
        static int price_per_sq_feet = 10;
        int area(){
            return length*breadth;
        }

        int price(){
            return (price_per_sq_feet * area());
        }
    }

    class Bedroom extends Room {
    int height;
    int volume () {

        return length * breadth * height;
    }

    }

