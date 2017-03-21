/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c6command.v2;


public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM =  2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
    }
    
    public void high() {
        speed = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }
    
    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }
    
    public void low() {
        speed = LOW;
        System.out.println(location + " ceiling fan is on low");
    }
    public void off() {
        speed = OFF;
        System.out.println(location + " ceiling fan is on off");
    }
    
    public int getSpeed() { 
        return speed;
    }
}
