package adapter.general.classadapter;

public class PowerAdapter extends AC220 implements DC5 {
    @Override
    public int outputDC5V() {
        System.out.println("使用Adapter输出");
        return super.outputAC220()/44;
    }
}
