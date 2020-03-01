package factory.practice;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-25 19:10
 */
public class AlipayChina implements IChinaPay {
    @Override
    public void chinaPay() {
        System.out.println("Alipay in China");
    }
}
