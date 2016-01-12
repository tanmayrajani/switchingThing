package com.tanmayrajani.switchingThing;

import java.util.Scanner;

/**
 * Created by tanmay.rajani on 12/1/16.
 */
public class CheckerMain {
    public static void main(String[] args){
        System.out.println("Press 1 to switch on the fan");
        System.out.println("Press 2 to switch on the light");
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt() == 1){
            Switch sw = new Switch(new Fan());
            sw.turnOn();
            System.out.println("Must be feeling cold");
            sw.turnOff();
        }
        else{
            Switch sw = new Switch(new Light());
            sw.turnOn();
            System.out.println("Wanna sleep?");
            sw.turnOff();
        }
    }
}
