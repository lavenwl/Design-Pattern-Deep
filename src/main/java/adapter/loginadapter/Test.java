package adapter.loginadapter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-11 06:31
 */
public class Test {
    public static void main(String[] args) {
        PassportForThirdAdapter adapter = new PassportForThirdAdapter();
        adapter.login("tom", "123456");
        adapter.loginForQQ("qweasdaqweqsda");
        adapter.loginForWechat("qweqdasczcssas");
    }
}
