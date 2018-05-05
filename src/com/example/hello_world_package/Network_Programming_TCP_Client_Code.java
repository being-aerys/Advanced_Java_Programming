package com.example.hello_world_package;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Network_Programming_TCP_Client_Code {

    //RUN THE SERVER FIRST


    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",1500);//first argument  is server's IP address
        // second argument  is port number of the server to which our client program will send the client request depending upon the application level protocol
        //  it is 80 for HTTP protocol and we are using HTTP here
        //but lets use a different port here, 1500



        //Lets send a number to the server, double it there and then get that value back to the client and print here
        int to_send_to_Server, to_receive_from_the_server;
        System.out.println("Enter a number to send to the server\n");
        Scanner scanner = new Scanner(System.in);
        to_send_to_Server = scanner.nextInt();

        PrintStream printStream = new PrintStream(socket.getOutputStream());//using output stream to send data outside
        //send the integer through the stream
        printStream.println(to_send_to_Server);

        //lets make an inputstream to read any incoming values for this socket

        Scanner scanner1 =  new Scanner(socket.getInputStream());
        to_receive_from_the_server = scanner1.nextInt();

        System.out.println("The doubled value of the number as returned by the server is "+ String.valueOf(to_receive_from_the_server));





    }
}
