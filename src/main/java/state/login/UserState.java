package state.login;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-21 09:56
 */
public abstract class UserState {
    protected AppContext context;
    public void setContext(AppContext context) {
        this.context = context;
    }

    public abstract void favorite();

    public abstract void comment(String comment);
}
