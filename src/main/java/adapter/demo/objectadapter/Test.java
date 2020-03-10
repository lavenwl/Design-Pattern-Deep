package adapter.demo.objectadapter;


public class Test {
    public static void main(String[] args) {
        AC220 ac220 = new AC220();
        DC5 adaptor = new PowerAdapter(ac220);
        adaptor.outputDC5V();
    }
}
