package com.qa.day2;

public class Calculator {

    public static void addition(int a, int b){
        System.out.println(a + " + " + b + " = " + (a + b) );

    }
    public static void subtraction(int a, int b){
        System.out.println(a + " - " + b + " = " + (a - b) );

    }
    public static void multiplication(int a, int b){
        System.out.println(a + " * " + b + " = " + (a * b) );

    }
    public static void division(double a, double b){
        System.out.println(a + " / " + b + " = " + (a / b) );

    }



    public static void main(String[] args) {
        addition(5, 3);
        subtraction(5, 3);
        multiplication(5, 3);
        division(5, 3);
    }
}
