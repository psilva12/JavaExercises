package com.qa.day8;



import com.qa.day5.Array;

import java.util.*;
import java.util.stream.Collectors;

public class PersonWriteToFile {

    Person person1 = new Person();
    Person person2 = new Person();
    Person person3 = new Person();

    public static void main(String[] args) {
        PersonWriteToFile personWrite = new PersonWriteToFile();
        personWrite.populate();
        personWrite.listPop();
        personWrite.search("Ellie");
    }

    public void populate(){

        person1.setter("Michale", 25, "Security Guard");

        person2.setter("Ellie", 22, "Film Maker");
        person3.setter("Daniel", 27, "Pilot");

    }

    public void listPop(){

        List<String> mine = Arrays.asList(person1.getter(),person2.getter(), person3.getter());
            mine.stream()
               .forEach(s -> System.out.println(s));

    }

    public void search(String name){
        List<String> mine = Arrays.asList(person1.getName(),person2.getName(), person3.getName());
        System.out.println(mine);
        String searchPerson =
                mine.stream()
                    .filter(str -> str.toUpperCase().equals(name.toUpperCase()))
                    .collect(Collectors.joining());
        System.out.println(searchPerson);
    }


}
