package com.qa.day2Test;

import com.qa.day2.Blackjack;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlackjackTest {

    @BeforeClass
    public static void mainCheck(){
        Blackjack blackjack = new Blackjack();
        blackjack.main(null);
    }

    @Test
    public void blackjackCheck(){
        Blackjack blackjack = new Blackjack();
        assertEquals(blackjack.play(20,18),20);
        assertEquals(blackjack.play(22,23),0);
        assertEquals(blackjack.play(10,21),21);
        assertEquals(blackjack.play(1,22),1);
        assertEquals(blackjack.play(23,22),0);
    }



}
