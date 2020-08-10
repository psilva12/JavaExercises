package com.qa.day2;

public class Results {

    public static int physics = 0;
    public static int chemistry = 0;
    public static int biology = 0;
    public static int total = 0;
    public static double percentage = 0;


    public static void main(String[] args) {
        physics = 100;
        chemistry = 125;
        biology = 90;
        moduleResults();
        passMark();
    }

    public static void moduleResults(){
        System.out.println("Results: ");
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("Biology: " + biology);
        total = physics + chemistry + biology;
        System.out.println("Total: " + total);
    }

    public static void passMark(){
        percentage = total * 100 / 450;
        System.out.println("Your total percentage is: " + percentage);

    }
}
