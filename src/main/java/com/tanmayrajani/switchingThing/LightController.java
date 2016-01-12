/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tanmayrajani.switchingThing;

/**
 *
 * @author tanmay.rajani
 */
public class LightController {
    public void control(){
        Light l1 = new Light();
        Switch s1 = new Switch(l1);
        s1.turnOn();
        s1.turnOff();
    }
}
