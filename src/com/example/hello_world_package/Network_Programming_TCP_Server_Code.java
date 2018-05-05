package com.example.hello_world_package;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Network_Programming_TCP_Server_Code {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1500);
        Socket socket = serverSocket.accept();

        //lets set an inputstream for this socket
        Scanner scanner = new Scanner(socket.getInputStream());
        int input_from_the_client = scanner.nextInt();

        int doubled_value = input_from_the_client *2;

        PrintStream printStream = new PrintStream(socket.getOutputStream());
        printStream.println(doubled_value);
    }
}
