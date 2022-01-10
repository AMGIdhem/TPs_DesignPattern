package tp.devices.implementations;

import tp.devices.Device;

public class TV implements Device {

    @Override
    public String turnOff() {
        return "TV Off";
    }
    @Override
    public String turnOn() {
        return "TV On";
    }
}
