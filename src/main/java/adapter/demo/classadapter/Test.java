package adapter.demo.classadapter;

public class Test {
    public static void main(String[] args) {
        DC5 adaptor = new PowerAdapter();
        adaptor.outputDC5V();
    }
}
