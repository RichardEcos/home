package HomeBL;

import core.Sensor;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightTest {
    Sensor s1 = new Motion();
    Light l1 = new Light();
    Light l2 = new Light();
    Light l3 = new Light();
    @Before
    public void initInputs(){

    }

    @Test
    public void update() {
        l1.location = "001";
        l2.location = "001";
        s1.location = "place1";
        s1.message = new StringMessage("001");
        s1.addDevice(l1);
        s1.addDevice(l2);
        s1.notifyDevice();
        Integer expected = 3;
        Integer current = s1.getDevices().size();
        System.out.println(l1.getStatus());
        assertEquals("on", l1.status);
        assertEquals("on", l2.status);
    }
}