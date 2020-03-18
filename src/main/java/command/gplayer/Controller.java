package command.gplayer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-15 21:16
 */
public class Controller {
    private List<IAction> actions = new ArrayList<IAction>();

    public void addAction(IAction action) {
        this.actions.add(action);
    }

    public void execute(IAction action) {
        action.execute();
    }

    public void executes() {
        for(IAction action : actions) {
            action.execute();
        }

        actions.clear();
    }
}
