/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10;


public class GumballMachineTestDrive {

    
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        
        System.out.println();
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        
        System.out.println();
        
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        
        System.out.println();
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        
        System.out.println();
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
                
    }
    
}
