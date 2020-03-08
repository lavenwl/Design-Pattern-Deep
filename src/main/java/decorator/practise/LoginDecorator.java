package decorator.practise;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-07 11:15
 */
public class LoginDecorator extends Decorator {

    private List<String> rightList = new ArrayList<String>();

    public LoginDecorator(IRights rights) {
        super(rights);
        rightList.add("作业");
        rightList.add("题库");
        rightList.add("成长墙");
    }

    @Override
    public List<String> getRight() {
        rightList.addAll(super.getRight());
        return rightList;
    }
}
