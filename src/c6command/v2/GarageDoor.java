/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c6command.v2;


public class GarageDoor {
    String name = "Garage door";
    
    public void up(){
        System.out.println(name + " is up");
    }
    public void down() {
        System.out.println(name + " is down");
    }
    public void stop() {
        System.out.println(name + " is stop");
    }
    public void lightOn(){
        System.out.println(name + " light is on");
    }
    
    public void lightOff() {
        System.out.println(name + " light is off");
    }
}
