package adapter.loginadapter.v2;

import adapter.loginadapter.ResultMsg;
import adapter.loginadapter.v1.IpassportForThird;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-11 07:35
 */
public abstract class PassportForThirdAdapterDecorator implements IpassportForThird {

    protected PassportForThirdAdapter passportForThirdAdapter;

    public PassportForThirdAdapterDecorator(PassportForThirdAdapter passportForThirdAdapter) {
        this.passportForThirdAdapter = passportForThirdAdapter;
    }

    @Override
    public ResultMsg loginForQQ(String openId) {
        return passportForThirdAdapter.loginForQQ(openId);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return passportForThirdAdapter.loginForWechat(openId);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return passportForThirdAdapter.loginForToken(token);
    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return passportForThirdAdapter.loginForTelphone(phone, code);
    }

    protected abstract ResultMsg loginForTiktok(String openId);
}
