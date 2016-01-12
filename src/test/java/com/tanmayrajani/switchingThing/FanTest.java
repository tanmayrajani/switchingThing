/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tanmayrajani.switchingThing;

import org.junit.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

/**
 *
 * @author tanmay.rajani
 */
public class FanTest {

    Switchable f;
    public FanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        f = new Fan();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testOn() {
        System.out.println("on");
        f.on();
        assertNotNull(f);
    }

    @Test
    public void testOff() {
        System.out.println("off");
        f.off();
        assertNotNull(f);
    }
    
}
