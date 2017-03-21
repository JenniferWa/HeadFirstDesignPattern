/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3decorator;

/**
 *
 */
public class Decat extends Beverage{

    public Decat() {
        description = "Decat";
    }
    
    @Override
    public double cost() {
        return 1.05;
    }
    
}
