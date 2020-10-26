package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data = (T[])new Object[1];

    public int add(T item){
        int i = 0;
        int pos = -1;
        while (i < data.length){
            if (data[i] == null){
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
        if (index >= data.length)
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
        if (item == data[data.length-1]){
            data = Arrays.copyOf(data,data.length-1);
            return true;
        }
        int i = 0;
        while (i < data.length){
            if (data[i] == item ){
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

    public void sort(Comparator<T> comparator){ //change to fast sort and write DataComparator and foreach etarable
        int f = 0;
        T buff;
        for (int j = 0; j < data.length; j++) {
            for (int i = 0; i < data.length; i++) {
                f = comparator.compare(data[i], data[i+1]);
                if (f > 0){
                    buff = data[i];
                    data[i] = data[i+1];
                    data[i+1] = buff;
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

//    public static void sort(DataContainer<? extends Comparable> container){
//        Comparator<?> comparator ;
//        comparator.compare(container.data[1],container.data[2]);
//
//    }
//
//    public static void sort(DataContainer<? extends Comparable> container, Comparator<?> comparator){
//
//    }
}
