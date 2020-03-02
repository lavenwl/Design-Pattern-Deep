package builder.chain;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-29 21:28
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();

        builder.addName("设计模式").addPpt("PPT");
        System.out.println(builder.builer());

        StringBuilder sb = new StringBuilder();
        String s = sb.append(1).append("s").toString();
        System.out.println(s);

    }
}
