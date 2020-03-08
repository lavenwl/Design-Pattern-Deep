package bridge.message;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-08 21:56
 */
public class UrgentMessage {
    void sendMessage(String message, String toUser) {
        message = "[加急]" + message;
    }
}
