/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c6command.v2;


public class CeilingFanOnCommand implements Command{
    
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
    
}
