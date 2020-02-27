package HomeBL;

import core.Device;
import core.Sensor;

import java.util.List;

public class Motion extends Sensor {
    //core.Message message;

    public Motion() {
        //message = new StringMessage("HomeBL.Motion in");
        super.status = "off";
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void removeDevice(Device device) {

    }

    public String getLocation() {
        return location;
    }

    public void notifyDevice() {
        for (Device device: devices) {
            device.update(message);
        }
    }
}
