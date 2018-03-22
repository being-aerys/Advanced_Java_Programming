package com.example.hello_world_package;

class Room_class {
    int length, breadth;

    //Paremeterized Constructor
    Room_class(int x, int y){
        length = x;
        breadth = y;

    }

    int area(){
        return (length*breadth);
    }
}

class Bedroom_class extends Room_class {
    int height;
    Bedroom_class(int x, int y, int z){
        super(x,y);// passing values to the superclass such that length is initialized as x and breadth as y
        height = z;
    }

    int volume(){
        return(length*breadth*height);
    }
}

public class Inheritance_better_demo {
    public static void main (String[] args){
        Bedroom_class bedroom = new Bedroom_class(10,10,10);
        System.out.println("The area of the bedroom is "+ bedroom.area());
        System.out.println("The volume of the bedroom is "+bedroom.volume());
    }
}
