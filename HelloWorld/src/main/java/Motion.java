public class Motion extends Sensor {
    //Message message;

    public Motion() {
        message = new StringMessage("Motion in");
    }

    public int addDevice(Device device) {
        devices.add(device);
        return 0;
    }

    public int removeDevice(Device device) {
        return 0;
    }

    public String getLocation() {
        return location;
    }

    public int notifyDevice(final String location) {
        for (Device device: devices) {
            if(location == this.location)
                device.update(message);
            else
                System.out.println("Motion off");
        }

        return 0;
    }
}
