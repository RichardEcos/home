public class Main {

    public static void main(String[] args) {
        Device device1 = new Light();
        device1.identifier = "001";
        device1.location = "001";
        Device device2 = new Light();
        device2.identifier = "002";
        device2.location = "001";
        Device device3 = new Light();
        device3.identifier = "003";
        device3.location = "002";
        Device device4 = new Light();
        device4.identifier = "004";
        device4.location = "002";
        Device device5 = new Light();
        device5.identifier = "005";
        device5.location = "003";
        Device device6 = new Light();
        device6.identifier = "006";
        device6.location = "003";

        Motion sensor1 = new Motion();
        sensor1.location = "place1";
        Motion sensor2 = new Motion();
        sensor2.location = "place2";
        Motion sensor3 = new Motion();
        sensor3.location = "place3";

        Person p1 = new Person();
        p1.location = "place1";

        sensor1.addDevice(device1);
        sensor1.addDevice(device2);
        sensor2.addDevice(device3);
        sensor2.addDevice(device4);
        sensor3.addDevice(device5);
        sensor3.addDevice(device6);

        sensor1.notifyDevice(p1.location);
        sensor2.notifyDevice(p1.location);
        sensor3.notifyDevice(p1.location);
        sensor1.notifyDevice("place2");
        sensor2.notifyDevice("place2");
        sensor3.notifyDevice("place2");
    }


}
