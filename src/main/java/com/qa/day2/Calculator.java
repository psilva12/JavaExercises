package com.qa.day2;

public class Calculator {

    public static int addition(int a, int b){
        System.out.println(a + " + " + b + " = " + (a + b) );
        return a + b;

    }
    public static int subtraction(int a, int b){
        System.out.println(a + " - " + b + " = " + (a - b) );
        return a - b;
    }
    public static int multiplication(int a, int b){
        System.out.println(a + " * " + b + " = " + (a * b) );
        return a *b;

    }
    public static double division(int a, int b){
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



    public static void main(String[] args) {
        addition(5, 3);
        subtraction(5, 3);
        multiplication(5, 3);
        division(5, 3);
    }
}
