/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cps491_lab3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cody
 */
public class passwordCheckTest {
    
    public passwordCheckTest() {
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
     * Test of main method, of class passwordCheck.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        passwordCheck.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of propLength method, of class passwordCheck.
     */
    @Test
    public void testPropLength() {
        String[] tests = { "1235","12345678","aeiruviu23h41234","1","ijent4n22" };
        int passed = 0;
        for(int i = 0; i < tests.length; i++){
           if( passwordCheck.propLength(tests[i]) ) passed++;
        }
        System.out.print("propLength: " + passed + " of ");
        System.out.println(tests.length + " passed.");
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of charsSpec method, of class passwordCheck.
     */
    @Test
    public void testCharsSpec() {
        String[] tests = { "Aa21345678","A!a123","A12345678!","!!!!!!!!!!!!!!" };
        int passed = 0;
        for(int i = 0; i < tests.length; i++){
           if( passwordCheck.charsSpec(tests[i]) ) passed++;
        }
        System.out.print("charsSpec: " + passed + " of ");
        System.out.println(tests.length + " passed.");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validPassword method, of class passwordCheck.
     */
    @Test
    public void testValidPassword() {
        String[] tests = { "1", "A!a123" };
        int passed = 0;
        for(int i = 0; i < tests.length; i++){
           if( passwordCheck.validPassword(tests[i]) ) passed++;
        }
        System.out.print("validPassword: " + passed + " of ");
        System.out.println(tests.length + " passed.");
    }
    
}
