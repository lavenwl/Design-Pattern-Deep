package adapter.loginadapter.v2;

import adapter.loginadapter.ResultMsg;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-11 06:39
 */
public class LoginForTiktokAdapter extends AbstractAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTiktokAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if (!support(adapter)) {
            return null;
        }

        return super.LoginForRegist(id, null);
    }
}
