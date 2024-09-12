package com.example.app;

import java.awt.*;
import javax.swing.*;

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
    
    public static void createTwoInputView(MCD operation){
         // Create subpanel to add content
        JPanel subPanel = new JPanel(new GridLayout(0, 1, 10, 10));

        // Get class name and assign to label
        JLabel columnLabel = new JLabel(operation.getClass().getSimpleName());
        JLabel answer = new JLabel("Respuesta: ");
        
        // Create inputs
        JTextField firstInput = new JTextField(16);
        JTextField secondInput = new JTextField(16);
        
        // Validate numbers
        firstInput.addKeyListener(new NumberValidator(firstInput));
        secondInput.addKeyListener(new NumberValidator(secondInput));

        // Create button and event listener
        JButton button = new JButton("Calcular");
        button.addActionListener(new TwoInputListener(firstInput, secondInput, answer));

        addToSubpanel(subPanel, columnLabel, firstInput, secondInput, button, answer);
        mainPanel.add(subPanel);       
    }
    
    public static void addToSubpanel(JPanel subPanel, JComponent... components){
        for (JComponent component : components){
            subPanel.add(component);
        }
    }

    public static void createSingleInputView(Operation operation) {
        // Create subpanel to add content
        JPanel subPanel = new JPanel(new GridLayout(0, 1, 10, 10));

        // Get class name and assign to label
        JLabel columnLabel = new JLabel(operation.getClass().getSimpleName());
        JLabel answer = new JLabel("Respuesta: ");
        
        // Create inputs
        JTextField inputField = new JTextField(16);
        
        // Validate numbers
        inputField.addKeyListener(new NumberValidator(inputField));

        // Create button and event listener
        JButton button = new JButton("Calcular");
        button.addActionListener(new SingleInputListener(operation, inputField, answer));

        addToSubpanel(subPanel, columnLabel, inputField, button, answer);
        mainPanel.add(subPanel);
    }
}