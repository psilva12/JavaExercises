package com.qa.day2;

public class Flowchart {

    public static void main(String[] args) {
        System.out.println(myMethod(1,2, true));
        System.out.println(myMethod(3,3, false));
        System.out.println(myMethod(1,1, true));
        System.out.println();

        myFlow(520);
    }

    public static int myMethod(int a, int b, Boolean myBoolean){
        if (myBoolean){
          return a + b;
        }
        else {
            return a * b;
        }
    }

    public static String myFlow(int check){
        String myVar = "";
        if (check > 2000){
            System.out.println("A");
            myVar = "A";
            if (check > 6000){
                System.out.println("C");
                myVar = "C";
            }
            else {
                System.out.println("B");
                myVar = "B";
                if (check > 4000){
                    System.out.println("D");
                    myVar = "D";
                }
                else{
                    System.out.println("E");
                    myVar = "E";
                }
            }
        }
        else{
            System.out.println("1");
            myVar= "1";
            if (check > 100){
                System.out.println("3");
                myVar= "3";
                if (check > 600){
                    System.out.println("5");
                    myVar= "5";
                }
                else{
                    System.out.println("4");
                    myVar= "4";
                    if (check > 500){
                        System.out.println("6");
                        myVar= "6";
                    }
                    else{
                        System.out.println("7");
                        myVar= "7";
                    }
                }
            }
            else{
                System.out.println("2");
                myVar= "2";
            }
        }
    return myVar;
    }

}
