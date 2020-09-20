import java.util.Arrays;

public class Lab1<arr> {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 12));
        }
        int x;
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = x;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}