package com.example.hello_world_package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Event_handling_in_java {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFRAME");
        Panel panel = new Panel();
        //CREATE A SOURCE OF EVENT
        JButton jButton = new JButton("CLICK ME");
        panel.add(jButton);
        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        //Implement a Listener

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jButton.setBackground(Color.RED);
            }
        };

        //Another Example of Listener

        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                jButton.setBackground(Color.BLUE);

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                jButton.setBackground(Color.GREEN);

            }
        };


        //register the actionListener to an event source
        jButton.addActionListener(actionListener);
        jButton.addMouseListener(mouseListener);


    }
}
