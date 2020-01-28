public class StringMessage implements Message {
    String basicInformation;

    public StringMessage() {}

    public StringMessage(String message) {
        this.basicInformation = message;
    }

    public void createMessage() {

    }

    public String getMessage() {
        return basicInformation;
    }
}
