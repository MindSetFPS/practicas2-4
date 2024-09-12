package com.example.app;

public class MCD {
    public static int calculate(int a, int b){
        if (b == 0) {
            return a; // Base case: GCD(a, 0) is a
        }
        return calculate(b, a % b); // Recursive case
    }
}