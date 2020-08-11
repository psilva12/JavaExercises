package com.qa.day3;

public class Flowcharts {

    public static void main(String[] args) {
        // replace the "methodx" by the method to be called
        method4();
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

    public static void method3(){

        for(int i = 1; i <=10 ; i++){
           for( int e = 1; e <= 10; e++){
               System.out.println(e);
           }
        }
    }

    public static void method4(){

        for(int i = 1; i <= 10 ; i++) {
            for(int e = 1; e <= i; e++){
                System.out.println(i);
            }
        }
    }
}
