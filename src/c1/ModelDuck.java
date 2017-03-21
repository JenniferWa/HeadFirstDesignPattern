/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1;

import c1.fly.FlyNoWay;
import c1.quack.Quack;

/**
 *
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
    
}
