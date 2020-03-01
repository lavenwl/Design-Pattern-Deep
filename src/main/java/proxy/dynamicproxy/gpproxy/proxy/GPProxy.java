package proxy.dynamicproxy.gpproxy.proxy;

import com.sun.corba.se.spi.ior.iiop.JavaCodebaseComponent;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.FileWriter;
import java.lang.reflect.Constructor;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-01 21:19
 */
public class GPProxy {

    public static final String ln = "\r\n";

    public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, GPInvocationHandler invocationHandler) {
        // 1. 动态生成源码.java文件
        String src = generateSrc(Interfaces);
        // 2. java文件输出到磁盘， 保存为文件 $Proxy0.java
        String filePath = GPProxy.class.getResource("").getPath();
        File f = new File(filePath + "$Proxy0.java");
        FileWriter fw = new FileWriter(f);
        fw.write(src);
        fw.flush();
        fw.close();
        // 3. 把.java文件编译成$Proxy0.class文件
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
        Iterable iterable = manager.getJavaFileObjects(f);
        JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null);
        task.call();
        manager.close();
        // 4. 把生产的.class文件加载到JVM中
        Class proxyClass = loader.findClass("$Proxy0");
        Constructor
        // 5. 返回新的代理对象
        return null;
    }

    public static String generateSrc(Class<?>[] interfaces) {
        StringBuilder sb = new StringBuilder();
        sb.append("这里是代码");

        for (Method m : interfaces[0].getMethod()) {
            Class<?>[] params = m.getParameterTypes();

            StringBuilder paramNames = new StringBuilder();
            StringBuilder paramValues = new StringBuilder();
            StringBuilder paramClasses = new StringBuilder();

            for (int i = 0; i < params.length; i++) {
                class clazz = params[i];
                String type = clazz.getName();

            }

            sb.append("public" + m.getReturnType().getName() + " " + m.getName() + "(");
            sb.append("try{" + ln);
            sb.append("} catch {");
        }

        return sb.toString();



    }
}
