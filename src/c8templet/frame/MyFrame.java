/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c8templet.frame;

import java.awt.Graphics;
import javax.swing.JFrame;


public class MyFrame extends JFrame{
    public MyFrame(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setSize(300,300);
        this.setVisible(true);
    }
    public void paint(Graphics graphics){
        super.paint(graphics);
        String msg = "I rule !!";
        graphics.drawString(msg, 100, 100);
    }
    public static void main(String[] args){
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
