/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c6command;

public class Stereo {
    public void on(){
        System.out.println("Stereo is on");
    }
    public void off(){
        System.out.println("Stereo is off");
    }
    public void setCd(){
        System.out.println("Stereo is set cd");
    }
    public void setDvd() {
        System.out.println("Stereo is set dvd");
    }
    public void setRadio() {
        System.out.println("Stereo is set radio");
    }
    public void setVolume(int volume) {
        System.out.println("Stereo is set volume " + volume);
    }
}
