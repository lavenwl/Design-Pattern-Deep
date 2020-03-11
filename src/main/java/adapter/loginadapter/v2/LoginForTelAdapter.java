package adapter.loginadapter.v2;

import adapter.loginadapter.ResultMsg;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-11 06:39
 */
public class LoginForTelAdapter extends AbstractAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if (!support(adapter)) {
            return null;
        }

        return super.LoginForRegist(id, null);
    }
}
