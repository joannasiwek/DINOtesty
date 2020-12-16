/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.unittesty;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jw56288
 */
public class SuperAdditionTest {
    
    public SuperAdditionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of superaddition method, of class SuperAddition.
     */
    @org.junit.Test
    public void testSuperaddition() {
        System.out.println("superaddition");
        String a = "1";
        String b = "2";
        String expResult = "4";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        @org.junit.Test
    public void testSuperaddition1() {
        System.out.println("superaddition");
        String a = "x";
        String b = "y";
        String expResult = "xy";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSuperaddition2() {
        System.out.println("superaddition");
        String a = "1";
        String b = "1";
        String expResult = "0";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSuperaddition3() {
        System.out.println("superaddition");
        String a = "a";
        String b = "b";
        String expResult = "e";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSuperaddition4() {
        System.out.println("superaddition");
        String a = "100";
        String b = "1";
        String expResult = "101";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSuperaddition5() {
        System.out.println("superaddition");
        String a = "aa";
        String b = "bb";
        String expResult = "ee";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSuperaddition6() {
        System.out.println("superaddition");
        String a = "3";
        String b = "5";
        String expResult = "13";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSuperaddition7() {
        System.out.println("superaddition");
        String a = "s";
        String b = "g";
        String expResult = "gs";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.Test
    public void testSuperaddition8() {
        System.out.println("superaddition");
        String a = "99";
        String b = "1";
        String expResult = "4";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSuperaddition9() {
        System.out.println("superaddition");
        String a = "z1";
        String b = "m2";
        String expResult = "m1z2";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

	@org.junit.Test
    public void testSuperaddition14() {
        System.out.println("superaddition");
        String a = "6597";
        String b = "3490";
        String expResult = "1234";
    }
	 @org.junit.Test
    public void testSuperaddition12() {
        System.out.println("superaddition");
        String a = "kot";
        String b = "pies";
        String expResult = "kotopiesel";
    }
    @org.junit.Test
    public void testSuperaddition10() {
        System.out.println("superaddition");
        String a = "xd";
        String b = "xD";
        String expResult = "Xd";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
	
	@org.junit.Test
    public void testSuperaddition15() {
        System.out.println("superaddition");
        String a = "7865";
        String b = "1237";
        String expResult = "8954";
	   }
    @org.junit.Test
    public void testSuperaddition13() {
        System.out.println("superaddition");
        String a = "cyber";
        String b = "punk";
        String expResult = "cyberpunk2077";
            }
    @org.junit.Test
    public void testSuperaddition11() {
        System.out.println("superaddition");
        String a = "ha";
        String b = "ha";
        String expResult = "hihi";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
	@org.junit.Test
    public void testSuperaddition16() {
        System.out.println("superaddition");
        String a = "Robert";
        String b = "Kubica";
        String expResult = "Drajwer Błyskawica";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testSuperaddition17() {
        System.out.println("superaddition");
        String a = "George";
        String b = "Russel";
        String expResult = "0 pktowiec";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @org.junit.Test
    public void testSuperaddition18() {
        System.out.println("superaddition");
        String a = "ktos";
        String b = "zapomnial";
        String expResult = "zamknac klamry";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @org.junit.Test
    public void testSuperaddition19() {
        System.out.println("superaddition");
        String a = "inzynieria";
        String b = "oprogramowania";
        String expResult = "jest super";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testSuperaddition182() {
        System.out.println("superaddition");
        String a = "Anakin";
        String b = "Skywalker";
        String expResult = "Darth Vader";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testSuperaddition192() {
        System.out.println("superaddition");
        String a = "Imperator";
        String b = "Palpatine";
        String expResult = "Darth Sidious";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testSuperaddition20() {
        System.out.println("superaddition");
        String a = "Paul";
        String b = "McCartney";
        String expResult = "Macca";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @org.junit.Test
    public void testSuperaddition21() {
        System.out.println("superaddition");
        String a = "John";
        String b = "Lennon";
        String expResult = "Lenny";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
  
    @org.junit.Test
    public void testSuperaddition22() {
        System.out.println("superaddition");
        String a = "X";
        String b = "D";
        String expResult = "XDDD";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testSuperaddition23() {
        System.out.println("superaddition");
        String a = "hej";
        String b = "hej";
        String expResult = "hej ho!";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testSuperadditionmz1() {
        System.out.println("superaddition");
        String a = "siup";
        String b = "zium";
        String expResult = "serwus";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @org.junit.Test
    public void testSuperadditionmz2() {
        System.out.println("superaddition");
        String a = "lubie";
        String b = "dobre";
        String expResult = "jedzenie";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
	
    @org.junit.Test
    public void testSuperaddition22() {
        System.out.println("superaddition");
        String a = "Zbigniew";
        String b = "Stonoga";
        String expResult = "Brama";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @org.junit.Test
    public void testSuperaddition23() {
        System.out.println("superaddition");
        String a = "Peter";
        String b = "Parker";
        String expResult = "Spider-Man";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @org.junit.Test
    public void testSuperaddition2jodde() {
        System.out.println("superaddition");
        String a = "Jan";
        String b = "Pawel";
        String expResult = "Drugi";

    public void testSuperaddition51() {
        System.out.println("superaddition");
        String a = "w11";
        String b = "wydzial";
        String expResult = "sledczy";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @org.junit.Test
    public void testSuperaddition3jodde() {
        System.out.println("superaddition");
        String a = "wiedzmin";
        String b = "trzy";
        String expResult = "najlepszy";

    public void testSuperaddition52() {
        System.out.println("superaddition");
        String a = "marcinek";
        String b = "najman";
        String expResult = "futbolista";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
	   	    
}
