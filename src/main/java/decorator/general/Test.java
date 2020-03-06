package decorator.general;

public class Test {
    public static void main(String[] args) {
        Battercake battercake = new BaseBattercake();
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.getMsg());
        System.out.println(battercake.getPrice());
        // test git revert
    }
}
