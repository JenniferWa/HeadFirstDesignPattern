/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c8templet;

import java.util.Scanner;


public class CoffeeWithHook extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsConiments() {
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }
    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like milk and sugar with you coffee (y/n)? ");
        Scanner sc = new Scanner(System.in);
        answer = sc.nextLine();
        return answer;
    }
    
}
