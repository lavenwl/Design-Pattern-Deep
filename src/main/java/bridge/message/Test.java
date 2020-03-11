package bridge.message;

public class Test {
    public static void main(String[] args) {
        IMessage message = new SmsMessage();
        AbstractMessage abstractMessage = new NormalMessage(message);
        abstractMessage.sendMessage("加班申请", "王总");

        message = new EmailMessage();
        abstractMessage = new UrgentMessage(message);
        abstractMessage.sendMessage("病假", "王总");
    }
}
