package chain.better;

import chain.Member;

public class LoginHandler extends Handler {

    @Override
    public void doHandler(Member member) {
        if(null == member) {
            System.out.println("用户不存在");
            return;
        }
    }
}
