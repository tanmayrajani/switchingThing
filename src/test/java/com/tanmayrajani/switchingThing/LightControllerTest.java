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
public class LightControllerTest {
    
    LightController l1;
    public LightControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        l1 = new LightController();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testControl() {
        System.out.println("control");
        l1.control();
        assertNotNull(l1);
    }
    
}

