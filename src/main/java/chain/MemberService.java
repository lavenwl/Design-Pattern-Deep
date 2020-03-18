package chain;

import chain.better.AuthHandler;
import chain.better.Handler;
import chain.better.LoginHandler;
import chain.better.ValidateHandler;
import org.springframework.util.StringUtils;

public class MemberService {
    public void login(String username, String password) {
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            System.out.println("用户名密码为空");
            return;
        }

        Member member = checkExists(username, password);
        if(null == member) {
            System.out.println("用户不存在");
            return;
        }

        if (!"管理员".equals(member.getRoleName())) {
            System.out.println("你不是管理员, 没有操作权限");
            return;
        }

        System.out.println("可以进行操作了");
    }

    public void loginBetter(String username, String password) {

        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());

        builder.build().doHandler(new Member(username, password));

        System.out.println("可以进行操作了");
    }

    private Member checkExists(String username, String password) {
        Member member = new Member(username, password);
        member.setRoleName("管理员");
        return member;
    }


    public static void main(String[] args) {
        MemberService service = new MemberService();
        service.login("laven", "123");
    }

}
