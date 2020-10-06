package HomeWork2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortingMain {
    public static void main(String[] args) {
        int[] testarr1 = {1, 2, 3, 4, 5, 6};
        int[] testarr2 = {1, 1, 1, 1};
        int[] testarr3 = {9, 1, 5, 99, 9, 9};
        int[] testarr4 = {};

        //Проверка сортировки пузырьком
        System.out.println(Arrays.toString(testarr1) + "->" + Arrays.toString(Sorting.bubbleSort(testarr1)));
        System.out.println(Arrays.toString(testarr2) + "->" + Arrays.toString(Sorting.bubbleSort(testarr2)));
        System.out.println(Arrays.toString(testarr3) + "->" + Arrays.toString(Sorting.bubbleSort(testarr3)));
        System.out.println(Arrays.toString(testarr4) + "->" + Arrays.toString(Sorting.bubbleSort(testarr4)));

        int[] testarr5 = {1, 2, 3, 4, 5, 6};
        int[] testarr6 = {1, 1, 1, 1};
        int[] testarr7 = {9, 1, 5, 99, 9, 9};
        int[] testarr8 = {};

        //Проверка шейкерной сортировки
        System.out.println(Arrays.toString(testarr5) + "->" + Arrays.toString(Sorting.shakerSort(testarr5)));
        System.out.println(Arrays.toString(testarr6) + "->" + Arrays.toString(Sorting.shakerSort(testarr6)));
        System.out.println(Arrays.toString(testarr7) + "->" + Arrays.toString(Sorting.shakerSort(testarr7)));
        System.out.println(Arrays.toString(testarr8) + "->" + Arrays.toString(Sorting.shakerSort(testarr8)));

        //Проверка случайного массива
        int[] testarr9 = randomArray();
        System.out.println(Arrays.toString(testarr9) + "->" + Arrays.toString(Sorting.shakerSort(testarr9)));

        //Массив руками
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter array numbers one by one");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        System.out.println(Arrays.toString(arr) + "->" + Arrays.toString(Sorting.shakerSort(arr)));
    }

    //Случайный массив
    public static int[] randomArray() {
        Random rd = new Random();
        int c = rd.nextInt(10);
        int[] arr = new int[c];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10);
        }
        return arr;
    }
}
