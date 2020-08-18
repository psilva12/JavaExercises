package com.qa.day2;

public class Calculator {

    public int addition(int a, int b){
        System.out.println(a + " + " + b + " = " + (a + b) );
        return a + b;

    }
    public int subtraction(int a, int b){
        System.out.println(a + " - " + b + " = " + (a - b) );
        return a - b;
    }
    public int multiplication(int a, int b){
        System.out.println(a + " * " + b + " = " + (a * b) );
        return a *b;

    }
    public double division(int a, int b){
        if (a > b){
            System.out.println(a + " / " + b + " = " + (a / b) );
            double newC =(a / b);
            return newC;
        }
        else {
            System.out.println("Error, Division cannot be performed");
            return 0;
        }
    }

    public int testException(int a, int b){


        return 2;
    }



    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.addition(5, 3);
        calc.subtraction(5, 3);
        calc.multiplication(5, 3);
        calc.division(5, 3);
        calc.testException(2, 4);
    }
}
