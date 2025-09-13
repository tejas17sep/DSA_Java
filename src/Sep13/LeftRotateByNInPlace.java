package Sep13;

import java.util.Arrays;

public class LeftRotateByNInPlace {

    // Rotate array left by one position
    public static void leftRotateByOne(int[] arr) {
        int first = arr[0];
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[len - 1] = first;
    }

    // Rotate array left by n positions
    public static void leftRotate(int[] arr, int n) {
        int len = arr.length;
        n = n % len; // handle n > len

        for (int i = 0; i < n; i++) {
            leftRotateByOne(arr); // repeat shift n times
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2; // rotate by 2

        System.out.println("Before: " + Arrays.toString(arr));
        leftRotate(arr, n);
        System.out.println("After:  " + Arrays.toString(arr));
    }
}
