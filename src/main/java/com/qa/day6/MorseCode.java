package com.qa.day6;

import java.util.*;

public class MorseCode {

    List<String> alphabet = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
            "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
    List<String> morseAlphabet = new ArrayList<String>(Arrays.asList(".-","-...","-.-.", "-..", ".", "..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."));


    public static void main(String[] args) {
        MorseCode morse = new MorseCode();

        System.out.println(morse.method1("Hello World"));
        System.out.println(morse.method2(".../---/..."));
    }

    public String method1(String morse){
        String[] array = morse.split("",0);
        String myString = "";
        StringBuilder nyString = new StringBuilder();
        for(String i : array) {
            for (int e = 0; e < alphabet.size(); e++){
                if (i.toUpperCase().equals(alphabet.get(e).toUpperCase())) {
                    myString = myString + morseAlphabet.get(e);
                    //Rohan's method with StringBuilder
                    //just a test
                    nyString.append(morseAlphabet.get(e));
                }
            }
            if(i.equals(" ")){
                myString = myString + "/";
            }
        }
        return myString;
    }

    public String method2(String toMorse){
        String[] myArr = toMorse.split("/",0);
        String myString = "";
        for(String i : myArr) {
            for (int e = 0; e < morseAlphabet.size(); e++){
                if (i.equals(morseAlphabet.get(e))) {
                    myString = myString + alphabet.get(e);
                }
            }
            if(i.equals(" ")){
                myString = myString + "/";
            }
        }
        return myString;
    }
}
