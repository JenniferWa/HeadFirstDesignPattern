/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c8templet;


public class Coffee extends CaffeineBeverage{
    
    
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiment() {
        System.out.println("Adding Sugar and Milk");
    }
}
