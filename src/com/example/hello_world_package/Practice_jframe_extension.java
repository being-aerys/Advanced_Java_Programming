package com.example.hello_world_package;

import javax.swing.*;

public class Practice_jframe_extension extends JFrame {

    Practice_jframe_extension(String s){
        setVisible(true);
        setSize(600,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(s);
    }

    public static void main(String[] args) {
        Practice_jframe_extension practice_jframe_extension = new Practice_jframe_extension("Frame with title as argument");
    }
}
