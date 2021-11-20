/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.displayio;
import javax.swing.*;
import java.awt.*;

public class Display {
    //elments on the screen
    private JLabel code = new JLabel("Enter Code");
    private JTextField text = new JTextField(40);
    private JButton button = new JButton("search");
    private JLabel product = new JLabel("");
    private JFrame frame;

    //returns the text typed in the textbox by user
    public String getText() {
        return text.getText();
    }

    //returns the button object
    //used in cashRegister to add action listener
    public JButton getButton() {
        return button;
    }

    //constructor that initializes the display
    public Display() {
        this.frame = new JFrame();

        frame.setLayout(new FlowLayout());
        frame.add(code);
        frame.add(text);
        frame.add(button);
        frame.add(product);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    //places text on the screen
    public void displayText(String text) {
        product.setText(text);
    }
}


/**
 *
 * @author Jess
 */


