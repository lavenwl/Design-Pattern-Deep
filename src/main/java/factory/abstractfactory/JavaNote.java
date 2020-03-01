package factory.abstractfactory;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-23 21:27
 */
public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("Java note");
    }
}
