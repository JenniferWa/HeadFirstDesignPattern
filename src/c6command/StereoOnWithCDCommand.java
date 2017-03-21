/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c6command;

public class StereoOnWithCDCommand implements Command{ 
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void excute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
    
}
