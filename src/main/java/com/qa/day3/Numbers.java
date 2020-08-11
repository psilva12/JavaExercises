package com.qa.day3;

public class Numbers {
    public static int total = 0;

    public static void main(String[] args) {
        addValue(52);
        System.out.println(total);
    }

    public static int addValue(int a) {
        String str = Integer.toString(a);
        String[] arrOfStr = str.split("", 0);

        for (String s : arrOfStr) {
            total = total + Integer.parseInt(s);
        }
        return total;
    }


}
