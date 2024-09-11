package com.example.app;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class View {
    public static JPanel mainPanel;

    public static void RenderUi() {
        JFrame frame = new JFrame();
        frame.setSize(600, 400);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE; // Prevent stretching
        gbc.insets = new Insets(15, 15, 15, 15); // Add padding between components

        frame.getContentPane().add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void createView(Operation operation) {
        // Create subpanel to add content
        JPanel subPanel = new JPanel(new GridLayout(0, 1, 10, 10));

        // Get class name and assign to label
        JLabel columnLabel = new JLabel(operation.getClass().getSimpleName());
        JLabel answer = new JLabel("Respuesta: ");
        
        // Create inputs
        JTextField inputField = new JTextField(16);
        inputField.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent event){
                 if (event.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                     // Handle backspace key press
                     inputField.setEditable(true);
                     System.out.println("Backspace key pressed.");
                 } else {
                     
                     String allowedCharacters = "1234567890";
                     
                     if(allowedCharacters.indexOf(event.getKeyChar()) != -1){
                         System.out.println("Is a number");
                         inputField.setEditable(true);
                     } else {
                         inputField.setEditable(false);
                     }
                 }
            } 
         });

        
        JButton button = new JButton("Calcular");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                answer.setText("Respuesta: " + operation.calculate(Integer.parseInt(inputField.getText())));
            }
        });

        subPanel.add(columnLabel);
        subPanel.add(inputField);
        subPanel.add(button);
        subPanel.add(answer);
        mainPanel.add(subPanel);
    }
}