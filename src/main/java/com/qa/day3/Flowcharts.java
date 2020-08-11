package com.qa.day3;

public class Flowcharts {



    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1(){

        for(int a = 10; a < 20; a++){
            System.out.println(a);
        }

    }

    public static void method2(){

        for(int a = 10; a <= 20; a++){
            if(a%2 == 0){
                System.out.println("-");
            }
            else{
                System.out.println("*");
            }
        }

    }

}
