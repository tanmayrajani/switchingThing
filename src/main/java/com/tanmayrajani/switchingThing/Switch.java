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
public class Switch {
    
    private static Switchable switchable;
    
    //Solving DIP using Constructor Injection
    public Switch(Switchable switchable){
        Switch.switchable = switchable;
    }
    
    public void turnOn(){
        System.out.println("Turning on...");
        Switch.switchable.on();
    }
    
    public void turnOff(){
        System.out.println("Turning off...");
        Switch.switchable.off();
    }
}
