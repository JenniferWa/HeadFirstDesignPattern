/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c4factory;

import c4factory.Pizza;

public abstract class PizzaStore {
    public final Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.parepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    public abstract Pizza createPizza(String type);
}
