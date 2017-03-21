/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c7adapter;

import java.util.Random;


public class DuckAdapter implements Turkey{
    Duck duck;
    Random rand = new Random();
    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }
    
    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if(rand.nextInt(5) == 0){
            duck.fly();
        }
    }
    
}
