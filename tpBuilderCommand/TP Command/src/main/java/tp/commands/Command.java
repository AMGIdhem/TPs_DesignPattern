package tp.commands;

import tp.devices.Device;

public abstract  class Command {
    protected Device device;

    public Command(Device device) {
        this.device = device;
    }

    public abstract String execute() ;
    public abstract String undo();

}
