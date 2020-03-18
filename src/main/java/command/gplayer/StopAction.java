package command.gplayer;

import command.gplayer.Gplayer;
import command.gplayer.IAction;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-15 21:14
 */
public class StopAction implements IAction {

    private Gplayer gplayer;

    public StopAction(Gplayer gplayer) {
        this.gplayer = gplayer;
    }

    @Override
    public void execute() {
        gplayer.stop();
    }
}
