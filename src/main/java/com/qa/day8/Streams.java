package com.qa.day8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        Streams myStream = new Streams();
        myStream.method1();
        myStream.method2();
        myStream.method3();
        myStream.method4();

    }

    public void method1(){
        List<Integer> number = Arrays.asList(2,3,4,5);
        List<Integer> square =
                number.stream()
                        .filter(x -> x % 2 == 0)
                        .map(x -> x*x)
                        .filter(x -> x >=10)
                        .map(x -> x*100)
                        .collect(Collectors.toList());

        System.out.println(square);
    }
    public void method2(){
        List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
        names.stream()
            .forEach(x -> System.out.println("Hello " + x));
    }

    public void method3(){
        List<Integer> number = Arrays.asList(3, 4, 7, 8, 12);
        int multiply =
                number.stream()
                    .reduce((a,b) -> a*b )
                    .get();
        System.out.println(multiply);
    }

    public void method4(){
        List<Integer> number = Arrays.asList(2,8,3, 4, 12, 35, 22,6);
        int getMax =
            number.stream()
                .max(Comparator.naturalOrder())
                .get();
        int getMin =
                number.stream()
                .min(Comparator.naturalOrder())
                .get();
        int getSum=
                number.stream()
                    .reduce((a,b) -> a+b)
                    .get();
        List<Integer> evens=
                number.stream()
                    .filter(x -> x % 2 ==0)
                    .collect(Collectors.toList());
        List<Integer> odds=
                number.stream()
                        .filter(x -> x % 2 !=0)
                        .collect(Collectors.toList());


        System.out.println(getMax + " = Max");
        System.out.println(getMin + " = Min");
        System.out.println("Sum = " + getSum);
        System.out.println("Even numbers: " + evens);
        System.out.println("Odd numbers: " + odds);
        System.out.println("Get min of Sqaured = " + getMinVal(getSquare(number)));

    }
    public List<Integer> getSquare(List<Integer> list){
        return list.stream().map(x -> x*x).collect(Collectors.toList());
    }

    public int getMinVal(List<Integer> list){
        return list.stream().min(Comparator.naturalOrder()).get();
    }

}
