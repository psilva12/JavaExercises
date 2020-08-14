package com.qa.day2Test;

import com.qa.day2.Calculator;
import com.qa.day2.Flowchart;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlowchartTest {

    static Flowchart flowchart;

    @BeforeClass
    public static void before(){

        flowchart = new Flowchart();
        flowchart.main(null);
    }


    @Test
    public void myMethodCheck(){
        assertEquals(flowchart.myMethod(5,3,true), 8);
        assertEquals(flowchart.myMethod(5,3,false), 15);
    }

    @Test
    public void myFlow(){
        assertEquals(flowchart.myFlow(2500),"E");
        assertEquals(flowchart.myFlow(200),"7");
        assertEquals(flowchart.myFlow(20),"2");
        assertEquals(flowchart.myFlow(4500),"D");
        assertEquals(flowchart.myFlow(6500),"C");
        assertEquals(flowchart.myFlow(550),"6");
        assertEquals(flowchart.myFlow(650),"5");
    }

}
