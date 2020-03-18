package chain.better;

import chain.Member;

public class AuthHandler extends Handler {

    @Override
    public void doHandler(Member member) {
        if (!"管理员".equals(member.getRoleName())) {
            System.out.println("你不是管理员, 没有操作权限");
            return;
        }
    }
}
