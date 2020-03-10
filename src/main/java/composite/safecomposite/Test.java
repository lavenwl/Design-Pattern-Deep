package composite.safecomposite;

public class Test {
    public static void main(String[] args) {
        System.out.println("===============安全组合模式写法=================");
        File qq = new File("QQ");
        File wechat = new File("wechat");

        Folder office = new Folder("office", 2);

        File word = new File("word");
        File excel = new File("excel");
        File ppt = new File("ppt");

        office.add(word);
        office.add(excel);
        office.add(ppt);

        Folder wps = new Folder("WPS", 3);
        wps.add(new File("wps"));
        office.add(wps);

        Folder root = new Folder("root", 1);
        root.add(wechat);
        root.add(qq);
        root.add(office);

        root.show();

        root.list();
    }
}
