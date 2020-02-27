package core;

import core.Device;

import java.util.*;

public abstract class Sensor {
    protected List<Device> devices = new ArrayList<Device>();
    public Message message;
    public String location;
    public String status;

    public abstract void addDevice(Device device);
    public abstract List<Device> getDevices();
    public abstract void removeDevice(Device device);
    public abstract void notifyDevice();
}
