public class Light extends Device {

    public int update(Message message) {
        StringMessage me = (StringMessage)message;
        String a  = me.getMessage();
        System.out.println(a);

        return 0;
    }
}
