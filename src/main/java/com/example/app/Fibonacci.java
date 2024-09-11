package com.example.app;

public class Fibonacci extends Operation{
    public int calculate(int n){
        if (n <= 1) {
            return n; // Base cases: fib(0) = 0, fib(1) = 1
        }
        return calculate(n - 1) + calculate(n - 2); // Recursive case
    }
}
