package decorator.practise;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-07 09:42
 */
public class User implements IRights {

    List<String> rights = new ArrayList<String>();

    public User() {
        rights.add("问答");
        rights.add("文章");
        rights.add("精品课");
        rights.add("冒泡");
        rights.add("商城");
    }

    @Override
    public List<String> getRight() {
        return rights;
    }
}
