package facade.general;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-05 23:50
 */
public class Facade {
    SubSystemA subSystemA = new SubSystemA();
    SubSystemB subSystemB = new SubSystemB();
    SubSystemC subSystemC = new SubSystemC();

    public void doA() {
        subSystemA.doA();
    }

    public void doB() {
        subSystemB.doB();
    }

    public void doC() {
        subSystemC.doC();
    }
}
