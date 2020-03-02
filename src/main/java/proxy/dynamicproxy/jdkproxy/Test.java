package proxy.dynamicproxy.jdkproxy;


import proxy.dynamicproxy.IPerson;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-01 20:43
 */
public class Test {
    public static void main(String[] args) {
        Meipo meipo = new Meipo();
        IPerson zhangsan = meipo.getInstance(new Zhangsan());
        zhangsan.findLove();

        IPerson zhaoliu = meipo.getInstance(new Zhaoliu());
        zhaoliu.findLove();


        // 将JDK动态代理的对象写入磁盘, 反编译后查看动态生成对象的代码
        IPerson person = new Meipo().getInstance(new Zhangsan());
        try {
            FileOutputStream os = new FileOutputStream("$Proxy0.class");
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IPerson.class});
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
