package chain.better;

import chain.Member;
import org.springframework.util.StringUtils;

public class ValidateHandler extends Handler {

    @Override
    public void doHandler(Member member) {
        if(StringUtils.isEmpty(member.getUsername()) || StringUtils.isEmpty(member.getPassword())) {
            System.out.println("用户名密码为空");
            return;
        }
    }
}
