package com.qa.day2Test;

import com.qa.day2.Calculator;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    static Calculator calculator;

    @BeforeClass
    public static void before(){

        calculator = new Calculator();
        calculator.main(null);
    }

    @Test
    public void additionCheck(){
        assertEquals(calculator.addition(5,15), 20);
        assertEquals(calculator.addition(-5,10), 5);
    }

    @Test
    public void subtractionCheck(){
        assertEquals(calculator.subtraction(15,10), 5);
        assertEquals(calculator.subtraction(-5,5), -10);

    }

    @Test
    public void multiplicationCheck(){
        assertEquals(calculator.multiplication(15,10), 150);
        assertEquals(calculator.multiplication(5,5), 25);

    }

    @Test
    public void divisionCheck(){
        assertEquals(calculator.division(15, 5), 3, 1e-15 );
        assertEquals(calculator.division(4,10), 0, 1e-15);

    }


}
