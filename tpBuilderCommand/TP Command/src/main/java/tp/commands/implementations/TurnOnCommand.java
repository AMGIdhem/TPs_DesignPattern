package tp.commands.implementations;

import tp.commands.Command;
import tp.devices.Device;

public class TurnOnCommand extends Command {
    public TurnOnCommand(Device device) {
        super(device);
    }

    @Override
    public String undo() {
        return device.turnOff();
    }

    @Override
    public String execute() {
         return device.turnOn();
    }
}
