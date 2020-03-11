package adapter.loginadapter.v2;

import adapter.loginadapter.ResultMsg;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-11 07:47
 */
public class LoginForTiktokDecorator extends PassportForThirdAdapterDecorator {

    public LoginForTiktokDecorator(PassportForThirdAdapter passportForThirdAdapter) {
        super(passportForThirdAdapter);
    }

    @Override
    protected ResultMsg loginForTiktok(String openId) {
//        return super.passportForThirdAdapter.processLogin(openId);
        return null;
    }
}
