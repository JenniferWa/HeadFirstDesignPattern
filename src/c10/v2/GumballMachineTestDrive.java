/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10.v2;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(50);
        for (int i = 0; i < 50; i++) {
            System.out.println();

            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }

        System.out.println();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

       

    }

}
