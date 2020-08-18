package com.qa.day5Test;


import com.qa.day5.Cipher;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CipherTest {

    static Cipher cipher;

    @BeforeClass
    public static void mainCheck(){
        Cipher cipher = new Cipher();
        cipher.main(null);
    }

    @Test
    public void method1Test(){
        assertEquals(cipher.method1("wizard"),"draziw");
    }

}
