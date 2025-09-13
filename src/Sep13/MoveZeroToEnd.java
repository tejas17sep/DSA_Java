package Sep13;

import java.util.Arrays;

public class MoveZeroToEnd {

    // Function to move all zeros to the end
    public static void moveZeros(int[] arr) {
        int index = 0; // position for the next non-zero element

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap arr[i] with arr[index]
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};

        System.out.println("Before: " + Arrays.toString(arr));
        moveZeros(arr);
        System.out.println("After:  " + Arrays.toString(arr));
    }
}
