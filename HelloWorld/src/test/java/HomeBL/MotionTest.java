package HomeBL;

import core.Device;
import core.Sensor;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MotionTest {

    Sensor s1 = new Motion();
    Light l1 = new Light();
    Light l2 = new Light();
    Light l3 = new Light();
    @Before
    public void initInputs(){


    }

    @Test
    public void addDevice() {
        s1.addDevice(l1);
        s1.addDevice(l2);
        s1.addDevice(l3);
        Integer expected = 3;
        Integer current = s1.getDevices().size();
        assertEquals(expected, current);
    }
}