package com.qa.day8;

public class Person {

    String name;
    int age;
    String jobTitle;

    public void setter(String name, int age, String job){
        this.name = name;
        this.age = age;
        this.jobTitle = job;
    }

    public String getName(){
        return name;
    }
    public String getter(){
        return (name + ", " + age + ", " + jobTitle);
    }
}
