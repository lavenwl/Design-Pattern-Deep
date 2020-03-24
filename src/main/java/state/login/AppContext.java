package state.login;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-21 09:58
 */
public class AppContext {
    public static final UserState STATE_LOGIN = new LoginState();
    public static final UserState STATE_UNLOGIN = new UnloginState();
    private UserState currentState = STATE_UNLOGIN;
    {
        STATE_LOGIN.setContext(this);
        STATE_UNLOGIN.setContext(this);
    }

    public UserState getState() {
        return currentState;
    }

    public void setState(UserState currentState) {
        this.currentState = currentState;
        this.currentState.setContext(this);
    }

    public void favorite() {
        this.currentState.favorite();
    }

    public void comment(String comment) {
        this.currentState.comment(comment);
    }
}
