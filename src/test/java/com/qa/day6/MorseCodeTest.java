package com.qa.day6;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MorseCodeTest {

    MorseCode morseCode;

    @BeforeClass
    public static void initialise(){

    }

    @Test
    public void method1(){
        MorseCode morseCode = new MorseCode();
        assertEquals(morseCode.method1("Hello World"),"......-...-..---/.-----.-..-..-..");

    }

}
