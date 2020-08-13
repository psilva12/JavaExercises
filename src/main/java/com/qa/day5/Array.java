package com.qa.day5;

public class Array {

    public static int[] myArr = new int [10];


    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        for (int i = 0; i < myArr.length ; i++){
            myArr[i] = i;
            System.out.println(myArr[i]);
        }
        for (int i = 0; i < myArr.length ; i++){
            myArr[i] = i *10;
            System.out.println(myArr[i]);
        }

    }

}
