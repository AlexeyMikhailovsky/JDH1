package HomeWork2;

public class Sorting {

    public static int[] bubbleSort(int[] arr){
        int s = 0;

        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]){
                  s = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = s;
                }
            }
        }

        return arr;
    }

    public static int[] shakerSort(int[] arr){
        int i = 0;
        int s = 0;
        int left = 0;
        int right = arr.length;

        while(left < right){
            for (i = right; i > left ; i--) {
                if (arr[i - 1] > arr[i]){
                    s = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = s;
                }
            }
            left += 1;
            for (i = left; i < right ; i++) {
                if (arr[i - 1] > arr[i]) {
                    s = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = s;
                }
            }
            right -= 1;
        }

        return  arr;
    }
}
