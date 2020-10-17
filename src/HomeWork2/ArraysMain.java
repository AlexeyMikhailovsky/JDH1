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

        sc.close();

        //do .. while
        int i = 0;
         do{
             System.out.print(arr[i]);
             i++;
         }while(i < arr.length);
        System.out.println();

        //while
        i = 0;
        while(i < arr.length){
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

        /*Array in reverse
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

        //foreach
        int[] s = new int[arr.length];
        int j = arr.length;
        for (i = 0; i < arr.length; i++) {
            s[j - 1] = arr[i];
            j--;
        }
        for (int a: s){
            System.out.print(a);
        }
        System.out.println();
    }
}
