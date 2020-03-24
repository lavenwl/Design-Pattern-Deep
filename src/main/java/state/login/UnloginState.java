package state.login;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-21 10:01
 */
public class UnloginState extends UserState {
    @Override
    public void favorite() {
        this.switch2Login();
        this.context.getState().favorite();
    }

    @Override
    public void comment(String comment) {
        this.switch2Login();
        this.context.getState().comment(comment);

    }

    protected void switch2Login(){
        System.out.println("调整登录页");
        this.context.setState(this.context.STATE_LOGIN);
    }
}
