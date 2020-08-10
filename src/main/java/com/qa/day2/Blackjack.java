package com.qa.day2;

public class Blackjack {

    public static void main(String[] args) {

        System.out.println(play(10,21));
        System.out.println(play(20,18));
        System.out.println(play(1,22));
        System.out.println(play(22,23));

    }

    public static int play(int a, int b){
        if (a > b){
            if (a > 21){
                return b;
            }
            else {
                return a;
            }
        }
        else if (a < b){
            if (b > 21){
                return a;
            }
            else {
                return b;
            }
        }
        else if (a > 21 && b > 21){
            return 0;
        }
        return 0;
    }
}
