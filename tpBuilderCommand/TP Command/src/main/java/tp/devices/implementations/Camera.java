package tp.devices.implementations;

import tp.devices.Device;
import lombok.Data;

@Data
public class Camera implements Device {

    

    @Override
    public String turnOff() {
        return "Camera Off";
    }

    @Override
    public String turnOn() {
        return "Camera On";
    }
}
