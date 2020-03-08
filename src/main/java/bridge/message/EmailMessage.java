package bridge.message;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-08 21:54
 */
public class EmailMessage implements IMessage {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用邮件消息发送：" + message + "给" + toUser);
    }
}
