package com.qa.day3;

public class Taxes {

    public static int tax = 0;
    public static int income = 0;

    public static void main(String[] args) {
        getTax(16000);
        System.out.println("Tax: " + tax);
    }

    public static void getTax (int income){
        if (income >= 20000){
            if (income > 29999){
                if (income > 44999){
                    tax = 25;
                }
                else{
                    tax = 20;
                }
            }
            else{
                tax = 15;
            }
        }
        else if (income < 15000) {
            tax = 0;
        }
        else{
            tax = 10;
        }

    }
}
