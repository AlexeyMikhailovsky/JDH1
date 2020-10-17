package HomeWork4;

import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<Integer> data = new DataContainer<>();
        //Comparator<Integer> comparator;

        for (int i = 1; i < 11; i++) {
            data.add(i);
        }
        System.out.println(data.get(9));
        System.out.println(data.add(345));
        data.add(null);
        System.out.println(data.add(347));
        System.out.println(data.delete(0));
        System.out.println(data.delete((Integer) 347));
        System.out.println(data.delete(347));

        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(2);
        data.add(5);
        data.add(123);
        data.add(7);
        System.out.println(data.toString());
       // data.sort(comparator);
    }
}
