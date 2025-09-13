package Sep11;

import java.util.Arrays;

public class RemoveDublicateFromSortedArray {

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int j = 0; // index for unique elements

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1; // length of unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};

        int length = removeDuplicates(arr);

        System.out.println("Unique elements count: " + length);
        System.out.println("Array after removing duplicates: " 
                + Arrays.toString(Arrays.copyOf(arr, length)));
    }
}
