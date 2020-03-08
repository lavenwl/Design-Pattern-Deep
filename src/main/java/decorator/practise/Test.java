package decorator.practise;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-07 11:23
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getRight());
        Decorator decorator = new LoginDecorator(user);
        System.out.println(decorator.getRight());
    }
}
