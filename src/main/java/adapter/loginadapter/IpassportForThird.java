package adapter.loginadapter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-11 06:05
 */
public interface IpassportForThird {
    ResultMsg loginForQQ(String openId);
    ResultMsg loginForWechat(String openId);
    ResultMsg loginForToken(String token);
    ResultMsg loginForTelphone(String phone, String code);

}
