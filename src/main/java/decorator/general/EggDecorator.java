package decorator.general;

public class EggDecorator extends BattercakeDecorator {

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    public String getMsg() {
        return super.getMsg() + " + 1 个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
