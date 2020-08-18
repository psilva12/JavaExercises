package com.qa.day2Test;

import com.qa.day2.Results;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ResultsTest {

    static Results results;

    @BeforeClass
    public static void mainCheck(){
        Results results = new Results();
        results.main(null);
    }

    @Test
    public void moduleResCheck(){

        assertEquals(results.moduleResults(50,50,50), 150);
    }


}
