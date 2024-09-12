package com.example.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SingleInputListener implements ActionListener {
    
    public Operation operation; 
    public JTextField inputField; 
    public JLabel answer;
    
    public SingleInputListener(Operation operation, JTextField inpuTextField, JLabel answer){
        this.operation = operation;
        this.inputField = inpuTextField;
        this.answer = answer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        answer.setText("Respuesta: " + operation.calculate(Integer.parseInt(inputField.getText())));
    }
}