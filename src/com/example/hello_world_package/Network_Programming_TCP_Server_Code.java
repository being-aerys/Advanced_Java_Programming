package com.example.hello_world_package;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Network_Programming_TCP_Server_Code {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1500); //this port number 1500 is where this server socket will listen to for
        //any incoming requests

        Socket socket = serverSocket.accept(); //Listens for a connection to be made to this socket and accepts it.
       //lets see the port number of the client where this server connects to
        System.out.println("\n The port number used for client is "+socket.getPort());//Returns the client machine's port number to which this socket is connected.

        //You might think how does the server know which port to connect to on the client
        //Client's port number is the part of the TCP header in the ip packet. So the server finds out because the client tells it through its TCP header.

        // lets set an inputstream for this socket
        Scanner scanner = new Scanner(socket.getInputStream());
        int input_from_the_client = scanner.nextInt();

        int doubled_value = input_from_the_client *2;

        PrintStream printStream = new PrintStream(socket.getOutputStream());
        printStream.println(doubled_value);
    }
}
