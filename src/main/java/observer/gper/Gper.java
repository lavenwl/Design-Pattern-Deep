package observer.gper;

import java.util.Observable;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-22 20:25
 */
public class Gper extends Observable {
    private String name;
    private static final Gper GPER = new Gper();

    private Gper() {}

    public static Gper getInstance() {
        return GPER;
    }

    public void publicQuestion(Question question) {
        System.out.println("");
        setChanged();

    }
}
