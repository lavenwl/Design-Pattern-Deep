package bridge.message;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-08 21:57
 */
public abstract class AbstractMessage {
    private IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }

//    void snedMessage(String message, String toUser) {
//        message.send(message, toUser);
//    }
}
