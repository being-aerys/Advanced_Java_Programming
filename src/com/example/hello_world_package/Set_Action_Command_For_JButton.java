package com.example.hello_world_package;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Set_Action_Command_For_JButton extends JFrame{

    public static void main(String[] args) {

        JFrame frame = new Set_Action_Command_For_JButton();

        //Display the window.


        frame.setVisible(true);
        frame.setSize(300,300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set flow layout for the frame
        frame.getContentPane().setLayout(new FlowLayout());

        JButton button = new JButton("Java");

        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String action = actionEvent.getActionCommand();
                if (action.equals("Action_Command")) {
                    System.out.println("Button pressed!");
                }
            }
        };
        //set action listeners for buttons
        button.addActionListener(a);

        // define a custom  action command for the button
        button.setActionCommand("Action_Command");

        // add button to frame
        frame.add(button);


    }

    }

