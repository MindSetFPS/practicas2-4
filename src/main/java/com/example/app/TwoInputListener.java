package com.example.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TwoInputListener implements ActionListener {

    public JTextField firstTextField;
    public JTextField seconTextField;
    public JLabel answer;

    public TwoInputListener(JTextField firstTextField, JTextField secondTextField, JLabel answer) {
        this.firstTextField = firstTextField;
        this.seconTextField = secondTextField;
        this.answer = answer;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        answer.setText("Respuesta: " + MCD.calculate(
                Integer.parseInt(firstTextField.getText()),
                Integer.parseInt(seconTextField.getText())
                )
        );
    }
}
