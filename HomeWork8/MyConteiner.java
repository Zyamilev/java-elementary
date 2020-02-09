package HomeWork8;

import java.util.Collection;
import java.util.Iterator;

public class MyConteiner implements Collection {


    private Object[] array = new Object[0];

    @Override
    public String toString() {
        String result = "[ ";
        for (Object o : array
        ) {
            result += o;
            result += ", ";
        }
        return result + "]";
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        if (array.length != 0)
            return false;
        else {
            return true;
        }
    }

    @Override
    public boolean contains(Object object) {
        for (Object o : array) {
            if (o.equals(object))
                return true;
        }
        return false;

    }

    @Override

    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object object) {
        Object[] newArray = new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = object;
        array = newArray;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {

        for (Object o : c
        ) {
            add(o);
        }
        return true;
    }

    @Override
    public void clear() {
        array = new Object[0];
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
