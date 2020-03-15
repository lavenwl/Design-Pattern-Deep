package iterator.course;

import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-15 20:22
 */
public class IteratorImpl<E> implements Iterator{

    private List<E> list;
    private int cursor;
    private E element;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    @Override
    public Object next() {
        System.out.println("当前位置" + cursor);
        element = list.get(cursor);
        cursor ++;
        return element;
    }

    @Override
    public boolean hasNext() {
        if(cursor > list.size()) {
            return false;
        }
        return true;
    }
}
