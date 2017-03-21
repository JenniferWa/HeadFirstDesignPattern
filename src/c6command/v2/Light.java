/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c6command.v2;

/**
 *
 * @author wangjingxian
 */
public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }
    
    public void on(){
        System.out.println(name + " light is on");
    }
    
    public void off() {
        System.out.println(name + " light is off");
    }
}
