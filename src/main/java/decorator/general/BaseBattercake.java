package decorator.general;

public class BaseBattercake implements Battercake {

    @Override
    public String getMsg() {
        return "煎饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
