package com.qa.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayListPrac {

    public static List<String> myList = new ArrayList<>();


    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        myList.add("Paulo");
        myList.add("Ricardo");
        myList.add("Rod");
        myList.add("Rui");
        myList.add("David");

        System.out.println(myList);
        //Print every element in the ArrayList
        for (int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }

        //Replaces with new value
        myList.set(3, "Pedro");
        myList.set(4, "To");
        System.out.println(myList);

        //Removes element
        myList.remove(1);
        System.out.println(myList);

        //Sorts the array in alphabetical order
        Collections.sort(myList);
        System.out.println(myList);


    }

}
