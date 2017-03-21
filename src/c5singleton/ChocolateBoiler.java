/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c5singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    
    public void fill(){
        if(isEmpty()) {
            empty = false;
            boiled = false;
        }
    }
    
    public void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
        }
    }
    
    public void boil() {
        if(!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }
    
    public boolean isEmpty() {
        return empty;
    }
    
    public boolean isBoiled(){
        return boiled;
    }
}
