/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c7adapter;


public class DuckTestDrive {


    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        
        System.out.println("Turkey says...");
        turkey.gobble();
        turkey.fly();
        
        System.out.println("\nThe Duck says...");
        testDuck(duck);
        
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
    
}
