/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c6command.v2;

public class MacroCommand implements Command{
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }
    
    
    @Override
    public void execute() {
        for(Command command : commands){
            command.execute();
        }
    }

    @Override
    public void undo() {
        for(Command command : commands){
            command.undo();
        }
    }
    
}
