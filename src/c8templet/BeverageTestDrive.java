/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c8templet;


public class BeverageTestDrive {
    public static void main(String[] args) {
        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        
        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
