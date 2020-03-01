package proxy.staticproxy;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-01 20:27
 */
public class Zhanglaosan implements IPerson {

    IPerson son;

    public Zhanglaosan(IPerson son) {
        this.son = son;
    }

    @Override
    public void findLove() {
        son.findLove();
    }
}
