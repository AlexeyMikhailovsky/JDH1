package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class DataContainer<T> implements Iterable<T>, Comparable<T>{
    private T[] data ;

    public DataContainer(){
        this.data =  (T[]) new Object[0];
    }
    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add(T item){
        if ( item == null )
            return -1;
        int i = 0;
        int pos = -1;
        while (i < data.length){
            if ( data[i] == null ){
                data[i] = item;
                pos = i;
                break;
            }
            i++;
        }
        if (i == data.length){
            data = Arrays.copyOf(data,data.length+1);
            data[i] = item;
            pos = i;
        }
        return pos;
    }

    public T get(int index){
        if ((index >= data.length) || (index < 0))
            return null;
        return data[index];
    }

    public T[] getItems(){
        return data;
    }

    public boolean delete(int index){
        if (index == data.length-1){
            data = Arrays.copyOf(data,index-1);
            return true;
        }
        if (index < data.length-1){
            for (int i = index; i < data.length - 1 ; i++) {
                data[i] = data[i+1];
            }
            data = Arrays.copyOf(data,data.length-1);
            return true;
        }
        return false;
    }

    public boolean delete(T item){
        int i = 0;
        while (i < data.length){
            if ( data[i] != null && data[i].equals(item) ){
                for (int j = i; j < data.length - 1 ; j++) {
                    data[j] = data[j+1];
                }
                data = Arrays.copyOf(data,data.length-1);
                return true;
            }
            i++;
        }
        return false;
    }

    public void sort(Comparator<T> comparator){
        int f = 0;
        T buff;
        for (int j = 0; j < data.length; j++) {
            for (int i = 0; i < data.length; i++) {
                if (i != data.length - 1){
                    f = comparator.compare(data[i], data[i+1]);
                    if (f >= 0){
                        buff = data[i];
                        data[i] = data[i+1];
                        data[i+1] = buff;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null)
                str.append(data[i].toString() + ", ");
        }
        return "DataContainer{" +
                "data=" + str +
                '}';
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    public void set(T value,int index){
        this.data[index] = value;
    }
//    public static void sort(DataContainer<? extends Comparable> container){
//        int f = 0;
//        Object buff,buff2;
//        for (int j = 0; j < container.data.length; j++) {
//            for (int i = 0; i < container.data.length-1; i++) {
//                f = container.data[i].compareTo(container.data[i+1]);
//                if (f >= 0){
//                    buff = container.get(i);
//                    buff2 = container.get(i+1);
//                    container.set(((? extends Comparable) buff2),i);
//                }
//            }
//        }
//    }

//    public static void sort(DataContainer<?> container, Comparator<?> comparator){
//        int f = 0;
//        Object buff,buff2;
//        for (int j = 0; j < container.data.length; j++) {
//            for (int i = 0; i < container.data.length; i++) {
//                f = comparator.compare(container.get(i), container.get(i+1));
//                if (f >= 0){
//                    buff = container.get(i);
//                    buff2 = container.get(i+1);
//
//                }
//            }
//        }
//    }

    @Override
    public int compareTo(T o) {
        return this.toString().compareTo(o.toString());
    }
}
