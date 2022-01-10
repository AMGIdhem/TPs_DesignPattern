package tp;

import tp.commands.Command;
import tp.commands.implementations.TurnOnCommand;
import tp.commands.implementations.TurnOffCommand;

import tp.devices.Device;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RemoteControl {
    Integer nbrSlot;
    Command [] onCommands;
    Command [] offCommands;

    List<Command> executedCommands;
    public RemoteControl(Integer nbrSlot) {
        this.onCommands=new Command[nbrSlot];
        this.offCommands=new Command[nbrSlot];
        this.nbrSlot = nbrSlot;
        this.executedCommands=new ArrayList<>();
    }

    public void init(Device ...devices){
        for(int i=0;i<devices.length;i++){
            this.onCommands[i]=new TurnOnCommand(devices[i]);
            this.offCommands[i]=new TurnOffCommand(devices[i]);
        }

    }

    public void onButtonPressed(int id) {
        this.onCommands[id].execute();
        executedCommands.add(this.onCommands[id]);
    }

    public void offButtonPressed(int id) {
        this.offCommands[id].execute();
        executedCommands.add(this.offCommands[id]);
    }

    public void undo(){
        executedCommands.get(executedCommands.size()-1).undo();
    }

    public String getReport() {
        StringBuilder builder=new StringBuilder();
        for(Command command:executedCommands ){
            builder.append(command.execute()+"-");
        }
        return builder.toString();
    }
}
