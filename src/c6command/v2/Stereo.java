/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c6command.v2;


public class Stereo {
    String name = "Stereo";
    public void on (){
        System.out.println(name + " is on");
    }
    public void off (){
        System.out.println(name + " is off");
    }
    public void setCd (){
        System.out.println(name + " is set CD");
    }
    public void setDvd (){
        System.out.println(name + " is set DVD ");
    }
    public void setRadio (){
        System.out.println(name + " is radio");
    }
    public void setVolume (int volume){
        System.out.println(name + " is set volume " + volume);
    }
}
