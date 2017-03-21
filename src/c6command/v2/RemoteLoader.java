/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c6command.v2;

public class RemoteLoader {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        RemoteControl remoteControl = new RemoteControl();
//        
//        Light livingRoomLight = new Light("Living Room");
//        Light ketchenLight = new Light("Kitchen");
//        CeilingFan ceilingFan = new CeilingFan("Living Room");
//        GarageDoor garageDoor = new GarageDoor();
//        Stereo stereo = new Stereo();
//        
//        LightOnCommand livingRoomLightOn 
//                = new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff 
//                = new LightOffCommand(livingRoomLight);
//        LightOnCommand ketchenLightOn 
//                = new LightOnCommand(ketchenLight);
//        LightOffCommand ketchenLightOff 
//                = new LightOffCommand(ketchenLight);
//        
//        CeilingFanOnCommand ceilingFanOn 
//                = new CeilingFanOnCommand(ceilingFan);
//        CeilingFanOffCommand ceilingFanOffCommand 
//                = new CeilingFanOffCommand(ceilingFan);
//        
//        GarageDoorUpCommand garageDoorUp 
//                = new GarageDoorUpCommand(garageDoor);
//        GarageDoorDownCommand garageDoorDown 
//                = new GarageDoorDownCommand(garageDoor);
//        
//        StereoOnWithCDCommand stereoOnWithCD 
//                = new StereoOnWithCDCommand(stereo);
//        StereoOffCommand stereoOff 
//                = new StereoOffCommand(stereo);
//        
//        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//        remoteControl.setCommand(1, ketchenLightOn, ketchenLightOff);
//        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOffCommand);
//        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
//        
//        System.out.println(remoteControl);
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(1);
//        remoteControl.offButtonWasPushed(1);
//        remoteControl.onButtonWasPushed(2);
//        remoteControl.offButtonWasPushed(2);
//        remoteControl.onButtonWasPushed(3);
//        remoteControl.offButtonWasPushed(3);
//                
//    }
//    public static void main(String[] args) {
//        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
//        Light livingRoomLight = new Light("Living Room");
//         LightOnCommand livingRoomLightOn 
//                = new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff 
//                = new LightOffCommand(livingRoomLight);
//        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//        
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//    }
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        
        CeilingFanMeiumCommand ceilingFanMedium = 
                new CeilingFanMeiumCommand(ceilingFan);
        CeilingHighCommand ceilingFanHigh = 
                new CeilingHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = 
                new CeilingFanOffCommand(ceilingFan);
        
        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
        
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        
        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
    
}
