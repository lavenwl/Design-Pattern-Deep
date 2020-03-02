package prototype;

import java.io.*;

import com.alibaba.fastjson.JSON;

//public class Column implements IPrototype {
public class Column implements Cloneable, Serializable {

    private String name;

    private String index;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Column clone() {
        try {
            return (Column) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Column deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (Column) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Column deepCloneWithJSON() {
        return (Column) JSON.parse(JSON.toJSONString(this));
    }

    @Override
    public String toString() {
        return "Column{" +
                "name=" + name +
                ", index=" + index +
                '}';
    }
}
