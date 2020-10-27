package HomeWork4;

import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[5];
        DataContainer<Integer> data = new DataContainer<Integer>(numbers);
        DataComparator<Integer> comparator = new DataComparator<>();

        System.out.println(data.add(1));
        System.out.println(data.add(999));
        System.out.println(data.add(50));
        System.out.println(data.add(100));
        System.out.println(data.add(100));
        System.out.println(data.add(10));
        System.out.println(data.toString());

        data.sort(comparator);
        System.out.println(data.toString());
    }
}
