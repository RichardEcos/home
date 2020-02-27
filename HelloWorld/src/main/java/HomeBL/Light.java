package HomeBL;

import core.Device;
import core.Message;

public class Light extends Device {

    public Light() {
        super.status = "off";
    }

    public void update(Message message) {
        StringMessage me = (StringMessage)message;
        String a  = me.getMessage();

        if(a == this.location) {
            super.status = "on";
        } else {
            super.status = "off";
        }
    }

    public String getStatus() {
        return super.status;
    }
}
