package com.qa.day3;

public class Taxes {

    public static int tax = 0;
    public static int income = 0;

    public static void main(String[] args) {
        income = 36000;
        getTax(income);
        System.out.println("Tax: " + tax);
        System.out.println("Your total tax on: £" + income + " is £" + getTotal(tax, income));
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

    public static int getTotal(int tax, int income){
        return income * tax / 100;
    }

}
