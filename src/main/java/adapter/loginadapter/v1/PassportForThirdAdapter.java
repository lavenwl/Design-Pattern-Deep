package adapter.loginadapter.v1;

import adapter.loginadapter.PassportService;
import adapter.loginadapter.ResultMsg;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-11 06:25
 */
public class PassportForThirdAdapter extends PassportService implements IpassportForThird {
    @Override
    public ResultMsg loginForQQ(String openId) {
        return loginForRegist(openId, null);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return loginForRegist(openId, null);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return loginForRegist(token, null);
    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return loginForRegist(phone, null);
    }

    private ResultMsg loginForRegist(String username, String password) {
        if (null == password) {
            password = "THIRD_EMPTY";
        }
        super.regist(username, password);
        return super.login(username, password);
    }
}
