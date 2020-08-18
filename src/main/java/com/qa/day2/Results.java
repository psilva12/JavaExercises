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
        moduleResults(physics, chemistry, biology);
        passMark();
    }

    public static int moduleResults(int phyMark, int cheMark, int bioMark){
        System.out.println("Results: ");
        System.out.println("Physics: " + phyMark);
        System.out.println("Chemistry: " + cheMark);
        System.out.println("Biology: " + bioMark);
        if (bioMark < 60){
            failed = failed + 1;
        }
        if (cheMark < 60){
            failed = failed + 1;
        }
        if (phyMark < 60){
            failed = failed + 1;
        }
        total = phyMark + cheMark + bioMark;
        System.out.println("Total: " + total);
        return total;
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
