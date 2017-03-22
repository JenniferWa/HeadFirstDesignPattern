/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c8templet;


public abstract class CaffeineBeverage {
    void prepareRecipe(){
        boilWater();
        brew();
        
        pourInCup();
        if(customerWantsConiments()){
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();
    public void boilWater() {
        System.out.println("Boiling water");
    }
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
    boolean customerWantsConiments() {
        return true;
    }
}
