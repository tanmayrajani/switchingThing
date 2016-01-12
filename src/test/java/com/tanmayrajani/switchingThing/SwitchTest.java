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
public class SwitchTest {
    
    Switch instance;
    public SwitchTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Switch(new Light());
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testTurnOn() {
        System.out.println("turnOn");
        instance.turnOn();
        assertNotNull(instance);
    }

    @Test
    public void testTurnOff() {
        System.out.println("turnOff");
        instance.turnOff();
        assertNotNull(instance);
    }
    
}

