package com.qa.day6;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MorseCodeTest {

    static MorseCode morseCode;

    @BeforeClass
    public static void initialise(){
        MorseCode morseCode = new MorseCode();
    }

    @Test
    public void method1(){
        assertEquals(morseCode.method1("Hello World"),"......-...-..---/.-----.-..-..-..");

    }

}
