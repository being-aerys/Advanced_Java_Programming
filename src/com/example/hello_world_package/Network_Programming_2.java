package com.example.hello_world_package;


import java.net.*;

    public class Network_Programming_2 {


        public static void main(String[] args) {
            try {
                URL url = new URL("https://www.geeksforgeeks.org/url-class-java-examples/");

                System.out.println("Protocol: " + url.getProtocol());
                System.out.println("Host Name: " + url.getHost());
                System.out.println("Port Number: " + url.getPort()); //returns -1 since no port no specified by us in the url
                System.out.println("Port Number: " + url.getDefaultPort());//returns default port no for the protocol here for HTTPS 443
                System.out.println("File Name: " + url.getFile());

            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }
