package HomeWork1;

import java.util.Scanner;

public class PhoneNumberMain {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(createPhoneNumber(arr));
    }

    public static String createPhoneNumber(int[] arr){
        String str = "(";
        for (int i = 0; i < 3; i++) {
            str += Integer.toString(arr[i]);
        }
        str += ") ";

        for (int i = 3; i < 6; i++) {
            str += Integer.toString(arr[i]);
        }
        str += "-";

        for (int i = 6; i < 10; i++) {
            str += Integer.toString(arr[i]);
        }
        str += ".";

        return str;
    }
}
