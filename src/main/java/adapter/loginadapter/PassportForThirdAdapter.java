package adapter.loginadapter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-11 06:25
 */
public class PassportForThirdAdapter extends PassportService implements IpassportForThird {
    @Override
    public ResultMsg loginForQQ(String openId) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return null;
    }

    private ResultMsg loginForRegist(String username, String password) {
        if (null == password) {
            password = "THIRD_EMPTY";
        }
        super.regist(username, password);
        return super.login(username, password);
    }
}
