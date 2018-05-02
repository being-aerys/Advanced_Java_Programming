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

                //A URL can optionally specify a "port", which is the port number to which the TCP connection is made on the remote host machine. If the port is not specified, the default port for the protocol is used instead. For example, the default port for http is 80. An alternative port could be specified as:

                URL url_next = new URL("http://www.facebook.com:1010/docs/resource1.html");
                System.out.println("Port Number for url_next: " + url_next.getPort());




            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }
