package com.example.app;

import com.example.app.Operation;
import javax.swing.*;

public class Factorial extends Operation {
    public int calculate(int n) {
        if (n <= 1) {
            return 1;
        } else {
            System.out.println(n + "*" + (n - 1));
            return n * calculate(n - 1);
        }
    }
    

}
