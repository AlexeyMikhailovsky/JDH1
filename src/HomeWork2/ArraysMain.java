package HomeWork2;

import java.util.Scanner;

public class ArraysMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter array numbers one by one");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //do .. while
        int i = 0;
         do{
             System.out.print(arr[i]);
             i++;
         }while(i<arr.length);
        System.out.println();

        //while
        i = 0;
        while(i<arr.length){
            System.out.print(arr[i]);
            i++;
        }
        System.out.println();

        //for
        for(i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();

        //foreach
        for (int a: arr){
            System.out.print(a);
        }
        System.out.println();

        //every second element
        for (i = 0;  i< arr.length; i += 2) {
            System.out.print(arr[i]);
        }
        sc.close();
        System.out.println();

        /*Array out in reverse
        * do .. while
        * */
        i = arr.length-1;
        do{
            System.out.print(arr[i]);
            i--;
        }while(i >= 0);
        System.out.println();

        //while
        i = arr.length-1;
        while(i >= 0){
            System.out.print(arr[i]);
            i--;
        }
        System.out.println();

        //for
        for(i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]);
        }
        System.out.println();

        // foreach в обратном порядке невозможен т.к. нет данного варианта в документации
        // + как пример бесконечная последовательность элементов. Не зная конечного числа элементов
        // невозможно двигаться от последнего к первому.
    }
}
