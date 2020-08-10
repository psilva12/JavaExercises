package com.qa.day2;

public class Flowchart {
    public static int check = 0;

    public static void main(String[] args) {
        System.out.println(myMethod(1,2, true));
        System.out.println(myMethod(3,3, false));
        System.out.println(myMethod(1,1, true));
        System.out.println();
        check = 520;
        myFlow();
    }

    public static int myMethod(int a, int b, Boolean myBoolean){
        if (myBoolean){
          return a + b;
        }
        else {
            return a * b;
        }
    }

    public static void myFlow(){
        if (check > 2000){
            System.out.println("A");
            if (check > 6000){
                System.out.println("C");
            }
            else {
                System.out.println("B");
                if (check > 4000){
                    System.out.println("D");
                }
                else{
                    System.out.println("E");
                }
            }
        }
        else{
            System.out.println("1");
            if (check > 100){
                System.out.println("3");
                if (check > 600){
                    System.out.println("5");
                }
                else{
                    System.out.println("4");
                    if (check > 500){
                        System.out.println("6");
                    }
                    else{
                        System.out.println("7");
                    }
                }
            }
            else{
                System.out.println("2");
            }
        }

    }

}
