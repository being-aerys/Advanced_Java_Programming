package com.example.hello_world_package;


import javax.swing.*;
import java.awt.*;

public class Layout_Managers_one {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FRAME FROM SWING CLASS");
        Panel panel = new Panel();
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        BorderLayout borderLayout = new BorderLayout();

        panel.setLayout(borderLayout);
        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");
        Button b4 = new Button("b4");
        Button b5 = new Button("b5");

        panel.add(b1,borderLayout.NORTH);
        panel.add(b2,borderLayout.SOUTH);
        panel.add(b3,borderLayout.EAST);
        panel.add(b4,borderLayout.WEST);
        panel.add(b5,borderLayout.CENTER);




    }
}

