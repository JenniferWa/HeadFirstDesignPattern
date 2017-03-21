/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1;

import c1.fly.FlyWithWings;
import c1.quack.Quack;

/**
 *
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
    
}
