package adapter.loginadapter.v2;

import adapter.loginadapter.PassportService;
import adapter.loginadapter.ResultMsg;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-11 06:42
 */
public abstract class AbstractAdapter extends PassportService implements ILoginAdapter {
    protected ResultMsg LoginForRegist(String username, String password) {
        if (null == password) {
            password = "THIRD_EMPTY";
        }
        super.regist(username, password);
        return super.login(username, password);
    }
}
