package HomeWork2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Done, except Random
public class SortingMain {
    public static void main(String[] args) {
        int[] testarr1 = {1, 2, 3, 4, 5, 6};
        int[] testarr2 = {1, 1, 1, 1};
        int[] testarr3 = {9, 1, 5, 99, 9, 9};
        int[] testarr4 = {};

        System.out.println(Arrays.toString(testarr1) + "->" + Arrays.toString(Sorting.bubbleSort(testarr1)));
        System.out.println(Arrays.toString(testarr2) + "->" + Arrays.toString(Sorting.bubbleSort(testarr2)));
        System.out.println(Arrays.toString(testarr3) + "->" + Arrays.toString(Sorting.bubbleSort(testarr3)));
        System.out.println(Arrays.toString(testarr4) + "->" + Arrays.toString(Sorting.bubbleSort(testarr4)));

        System.out.println(Arrays.toString(randomArray()));

        Scanner sc = new Scanner(System.in);
        int[] testarr5 = new int[sc.nextInt()];
        for (int i = 0; i < testarr5.length; i++) {
            testarr5[i] = sc.nextInt();
        }
    }

    //check how Random works
    public static int[] randomArray() {
        Random rd = new Random();
        int c = rd.nextInt();
        if (c < 0)
            c *= -1;
        int[] arr = new int[c];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        return arr;
    }
}
