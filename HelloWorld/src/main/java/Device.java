public abstract class Device {
    String location;
    String identifier;

    public Device() {}
    public abstract int update(Message message);
}
