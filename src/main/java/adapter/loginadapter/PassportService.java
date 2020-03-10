package adapter.loginadapter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-11 06:01
 */
public class PassportService {
    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }

    public ResultMsg login(String username, String password) {
        return null;
    }
}
