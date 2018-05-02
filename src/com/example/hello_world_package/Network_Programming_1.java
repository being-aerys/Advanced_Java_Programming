package com.example.hello_world_package;

import java.net.InetAddress;


public class Network_Programming_1 {
    public static void main(String[] args) throws java.net.UnknownHostException {

        InetAddress inetAddress = InetAddress.getLocalHost();

        //Let's see the local host name and IP address of our computer
        System.out.println("Our computer's name and IP address are  "+ inetAddress);

        //Let's see the IP address of a website

        InetAddress addressName = InetAddress.getByName("facebook.com");
        System.out.println("The IP address of facebook.com is "+addressName);

        InetAddress in[] = InetAddress.getAllByName("gmail.com"); //returns all IP addresses resolved by the given website name

        for (int i = 0;i<in.length;i++){
            System.out.println(in[i]+"\t");
        }
    }
}
