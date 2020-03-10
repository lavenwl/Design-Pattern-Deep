package adapter.demo.objectadapter;

public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        System.out.println("使用Adapter输出");
        return ac220.outputAC220()/44;
    }
}
