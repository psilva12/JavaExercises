package com.qa.day2;

public class Results {

    public static int physics = 0;
    public static int chemistry = 0;
    public static int biology = 0;
    public static int total = 0;
    public static double percentage = 0;
    public static int failed = 0;


    public static void main(String[] args) {
        physics = 150;
        chemistry = 150;
        biology = 150;
        moduleResults();
        passMark();
    }

    public static void moduleResults(){
        System.out.println("Results: ");
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("Biology: " + biology);
        if (biology < 60){
            failed = failed + 1;
        }
        if (chemistry < 60){
            failed = failed + 1;
        }
        if (physics < 60){
            failed = failed + 1;
        }
        total = physics + chemistry + biology;
        System.out.println("Total: " + total);
    }

    public static void passMark(){
        percentage = total * 100 / 450;
        System.out.println("Your total percentage is: " + percentage);
        if ( percentage >= 60) {
            System.out.println();
            if (percentage == 100){
                System.out.println("YOU PASSED. YOU GOT PERFECT MARK");
            }
            else if (physics >= 60 && biology >= 60 && chemistry >= 60) {
                System.out.println("YOU PASS, CONGRATULATIONS!");
            }
        }
        else if (failed == 1) {
            System.out.println("You have failed in one of your modules, therefore you have failed:");
        }
        else if (failed == 2) {
            System.out.println("You have failed in two of your modules, therefore you have failed:");
        }
        else {
            System.out.println("You have failed all of your modules, YOU HAVE FAILED:");
        }
    }
}
