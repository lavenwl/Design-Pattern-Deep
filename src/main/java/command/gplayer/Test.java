package command.gplayer;


public class Test {
    public static void main(String[] args) {
        Gplayer gplayer = new Gplayer();
        Controller controller = new Controller();
        controller.execute(new PlayAction(gplayer));

        controller.addAction(new PlayAction(gplayer));
        controller.addAction(new SpeedAction(gplayer));
        controller.addAction(new StopAction(gplayer));
        controller.executes();
    }

}
