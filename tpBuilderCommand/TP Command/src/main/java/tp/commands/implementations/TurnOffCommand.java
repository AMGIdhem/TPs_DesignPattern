package tp.commands.implementations;

import tp.commands.Command;
import tp.devices.Device;

public class TurnOffCommand extends Command {
    public TurnOffCommand(Device device) {
        super(device);
    }

    @Override
    public String execute() {
        return device.turnOff();
    }

    @Override
    public String undo() {
        return device.turnOn();
    }
}
