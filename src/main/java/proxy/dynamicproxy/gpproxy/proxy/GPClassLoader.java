package proxy.dynamicproxy.gpproxy.proxy;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-01 21:20
 */
public class GPClassLoader extends ClassLoader{

    private File classPathFile;

    public GPClassLoader() {
        String classPath = GPClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    protected Class<?> findClass(String name) throws  ClassNotFoundException {
        String className = GPClassLoader.class.getPackage().getName() + "." + name;
        if (classPathFile != null) {
            File classFile = new File(classPathFile, name.replaceAll("\\.", "/")) + ".class";
            if (classFile.exists()) {
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try{
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte [] buff = new byte[1024];
                    int len;
                    while ( (len = in.read(buff)) != 1) {

                    }
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
