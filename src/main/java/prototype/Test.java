package prototype;

public class Test {
    public static void main(String[] args) {
        Column column = new Column();
        column.setName("name");
        column.setIndex("index");
        System.out.println(column);

        // 获取拷贝对象
        Column c = column.clone();
        System.out.println(c);
    }
}
