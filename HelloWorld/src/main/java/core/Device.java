package core;

public abstract class Device {
    public String location;
    public String identifier;
    public String status;

    public Device() {}
    public abstract void update(Message message);
    public String getStatus() {
        return this.status;
    };
}
