package com.example.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        View.RenderUi();
        Factorial factorial = new Factorial();
        Fibonacci fibonacci = new Fibonacci();
        View.createView(factorial);
        View.createView(fibonacci);
        View.createView(factorial);
        // .calculate(5);
    }
}
