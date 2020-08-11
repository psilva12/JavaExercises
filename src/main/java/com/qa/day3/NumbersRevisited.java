package com.qa.day3;

public class NumbersRevisited {

    //need to finish numbers for this one
    public static void main(String[] args) {

        printLoop();
    }

    public static void printLoop() {

        for (int i = 1; i <= 100; i++) {
            String str = Integer.toString(i);
            String[] arrOfStr = str.split("", 0);
            if (arrOfStr.length == 3) {
                System.out.println("one hundred");
            } else if (arrOfStr.length == 2) {
                if (arrOfStr[0].equals("1")) {
                    if (arrOfStr[1].equals("0")) {
                        System.out.println("Ten");
                        continue;
                    }
                    if (arrOfStr[1].equals("1")) {
                        System.out.println("Eleven");
                        continue;
                    }
                    if (arrOfStr[1].equals("2")) {
                        System.out.println("Twelve");
                        continue;
                    }
                    if (arrOfStr[1].equals("3")) {
                        System.out.println("Thirteen");
                        continue;
                    }
                    if (arrOfStr[1].equals("4")) {
                        System.out.println("Fourteen");
                        continue;
                    }
                    if (arrOfStr[1].equals("5")) {
                        System.out.println("Fifteen");
                        continue;
                    }
                    if (arrOfStr[1].equals("6")) {
                        System.out.println("Sixteen");
                        continue;
                    }
                    if (arrOfStr[1].equals("7")) {
                        System.out.println("Seventeen");
                        continue;
                    }
                    if (arrOfStr[1].equals("8")) {
                        System.out.println("Eighteen");
                        continue;
                    }
                    if (arrOfStr[1].equals("9")) {
                        System.out.println("Nineteen");
                        continue;
                    }
                }
                if (arrOfStr[0].equals("2")) {
                    System.out.print("Twenty");
                }
                if (arrOfStr[0].equals("3")) {
                    System.out.print("Thirty");
                }
                if (arrOfStr[0].equals("4")) {
                    System.out.print("Forty");
                }
                if (arrOfStr[0].equals("5")) {
                    System.out.print("Fifty");
                }
                if (arrOfStr[0].equals("6")) {
                    System.out.print("Sixty");
                }
                if (arrOfStr[0].equals("7")) {
                    System.out.print("Seventy");
                }
                if (arrOfStr[0].equals("8")) {
                    System.out.print("Eighty");
                }
                if (arrOfStr[0].equals("9")) {
                    System.out.print("Ninety");
                }
                if (arrOfStr[1].equals("1")) {
                    System.out.print(" one");
                }
                if (arrOfStr[1].equals("2")) {
                    System.out.print(" two");
                }
                if (arrOfStr[1].equals("3")) {
                    System.out.print(" three");
                }
                if (arrOfStr[1].equals("4")) {
                    System.out.print(" four");
                }
                if (arrOfStr[1].equals("5")) {
                    System.out.print(" five");
                }
                if (arrOfStr[1].equals("6")) {
                    System.out.print(" six");
                }
                if (arrOfStr[1].equals("7")) {
                    System.out.print(" seven");
                }
                if (arrOfStr[1].equals("8")) {
                    System.out.print(" eight");
                }
                if (arrOfStr[1].equals("9")) {
                    System.out.print(" nine");
                }
            } else if (arrOfStr.length == 1) {
                if (arrOfStr[0].equals("1")) {
                    System.out.print(" one");
                }
                if (arrOfStr[0].equals("2")) {
                    System.out.print(" two");
                }
                if (arrOfStr[0].equals("3")) {
                    System.out.print(" three");
                }
                if (arrOfStr[0].equals("4")) {
                    System.out.print(" four");
                }
                if (arrOfStr[0].equals("5")) {
                    System.out.print(" five");
                }
                if (arrOfStr[0].equals("6")) {
                    System.out.print(" six");
                }
                if (arrOfStr[0].equals("7")) {
                    System.out.print(" seven");
                }
                if (arrOfStr[0].equals("8")) {
                    System.out.print(" eight");
                }
                if (arrOfStr[0].equals("9")) {
                    System.out.print(" nine");
                }
            }
            System.out.println();
        }

        }

    }

