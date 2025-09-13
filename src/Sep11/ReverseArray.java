package Sep11;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 10, 10};

        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] reversed = new int[arr.length];
        int j = 0;

        // loop backward with i--
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[j] = arr[i];
            j++;
        }

        System.out.println("Reversed Array: " + Arrays.toString(reversed));
    }
}
