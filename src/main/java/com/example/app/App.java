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
        MCD mcd = new MCD();
        View.createSingleInputView(factorial);
        View.createSingleInputView(fibonacci);
        View.createTwoInputView(mcd);
    }
}
