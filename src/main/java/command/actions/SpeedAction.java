package command.actions;

import command.Gplayer;
import command.IAction;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-15 21:14
 */
public class SpeedAction implements IAction {

    private Gplayer gplayer;

    public SpeedAction(Gplayer gplayer) {
        this.gplayer = gplayer;
    }

    @Override
    public void execute() {
        gplayer.speed();
    }
}
