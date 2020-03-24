package state.login;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-21 09:59
 */
public class LoginState extends UserState {
    @Override
    public void favorite() {
        System.out.println("收藏成功");
    }

    @Override
    public void comment(String comment) {
        System.out.println("评论成功:" + comment);
    }
}
