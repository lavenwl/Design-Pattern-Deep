package bridge.message;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-08 21:55
 */
public class NormalMessage extends AbstractMessage {
    public NormalMessage(IMessage message) {
        super(message);
    }

    void sendMessage(String message, String toUser) {
        message = "[普通]" + message;
    }
}
