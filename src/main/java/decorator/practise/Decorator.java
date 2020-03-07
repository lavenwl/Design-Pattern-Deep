package decorator.practise;

import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-07 10:58
 */
public class Decorator implements IRights {

    private IRights rights = null;

    public Decorator(IRights rights) {
        this.rights = rights;
    }

    @Override
    public List<String> getRight() {
        return rights.getRight();
    }
}
