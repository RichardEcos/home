import java.util.*;

public abstract class Sensor {
    List<Device> devices = new ArrayList<Device>();
    Message message;
    String location;

    public abstract int addDevice(Device device);
    public abstract int removeDevice(Device device);
    public abstract int notifyDevice(String location);
}
