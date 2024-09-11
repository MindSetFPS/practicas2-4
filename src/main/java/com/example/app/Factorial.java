package com.example.app;

public class Factorial {
    public static int calculate(int n){
        if(n <= 1){
            return 1;
        } else {
            System.out.println(n  + "*" + (n - 1));
            return n * calculate(n - 1);
        }
    } 
}
