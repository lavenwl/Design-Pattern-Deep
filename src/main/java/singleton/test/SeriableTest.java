package singleton.test;

import singleton.hungry.HungrySingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-01 15:54
 */
public class SeriableTest {
    public static void main(String[] args) {
        HungrySingleton s1 = null;
        HungrySingleton s2 = HungrySingleton.getInstance();

        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("HungerySingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("HungerySingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (HungrySingleton) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
