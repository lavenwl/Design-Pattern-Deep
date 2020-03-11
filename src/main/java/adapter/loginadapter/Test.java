package adapter.loginadapter;


import adapter.loginadapter.v2.LoginForTiktokDecorator;
import adapter.loginadapter.v2.PassportForThirdAdapter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-11 06:31
 */
public class Test {
    public static void main(String[] args) {
        PassportForThirdAdapter adapter = new PassportForThirdAdapter();
        LoginForTiktokDecorator tiktok = new LoginForTiktokDecorator(adapter);
        tiktok.loginForTiktok("123awedqwdq");
    }
}
