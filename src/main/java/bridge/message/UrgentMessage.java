package bridge.message;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-08 21:56
 */
public class UrgentMessage extends AbstractMessage {
    public UrgentMessage(IMessage message) {
        super(message);
    }

    void sendMessage(String message, String toUser) {
        message = "[加急]" + message;
        super.sendMessage(message, toUser);
    }
}
