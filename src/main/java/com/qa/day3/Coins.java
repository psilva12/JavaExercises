package com.qa.day3;


public class Coins {

    public static int twentyPounds = 0;
    public static int tenPounds = 0;
    public static int fivePounds = 0;
    public static int twoPounds = 0;
    public static int onePound = 0;
    public static int fiftyP = 0;
    public static int twentyP = 0;
    public static int tenP = 0;
    public static int fiveP = 0;
    public static int twoP = 0;
    public static int oneP = 0;


    public static void main(String[] args) {
        // a = Amount to pay  b = Payed
        returnAmount(2.99, 20);
        System.out.println("Change:");
        System.out.println("£20: " + twentyPounds);
        System.out.println("£10: " + tenPounds);
        System.out.println("£5: " + fivePounds);
        System.out.println("£2: " + twoPounds);
        System.out.println("£1: " + onePound);
        System.out.println("£0.5: " + fiftyP);
        System.out.println("£0.2: " + twentyP);
        System.out.println("£0.1: " + tenP);
        System.out.println("£0.05: " + fiveP);
        System.out.println("£0.02: " + twoP);
        System.out.println("£0.01: " + oneP);
    }

    public static void returnAmount(double a, double b){
        double change = b;
        change = b - a;
        while(change != 0){
            change = Math.round(change * 100.0) / 100.0;
            System.out.println(change);
            if (change - 10 >= 0){
                tenPounds = tenPounds+ 1;
                change = change - 10;
                continue;
            }
            if (change - 20 >= 0){
                twentyPounds = twentyPounds+ 1;
                change = change - 20;
                continue;
            }
            if (change - 5 >= 0){
                fivePounds = fivePounds+ 1;
                change = change - 5;
                continue;
            }
            if (change - 2 >= 0){
                twoPounds = twoPounds+ 1;
                change = change - 2;
                continue;
            }
            if (change - 1 >= 0){
                onePound = onePound+ 1;
                change = change - 1;
                continue;
            }
            if (change - 0.5 >= 0){
                fiftyP = fiftyP+ 1;
                change = change - 0.5;
                continue;
            }
            if (change - 0.2 >= 0){
                twentyP = twentyP+ 1;
                change = change - 0.2;
                continue;
            }
            if (change - 0.1 >= 0){
                tenP = tenP+ 1;
                change = change - 0.1;
                continue;
            }
            if (change - 0.05 >= 0){
                fiveP = fiveP+ 1;
                change = change - 0.05;
                continue;
            }
            if (change - 0.02 >= 0){
                twoP = twoP+ 1;
                change = change - 0.02;
                continue;
            }
            if (change - 0.01 >= 0){
                oneP = oneP+ 1;
                change = change - 0.01;
            }
        }
    }
}
