package Sep11;

public class CheckArrayIsSortedOrNot {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};  // Example array

		if (isSorted(arr)) {
			System.out.println("Array is sorted in ascending order.");
		} else {
			System.out.println("Array is NOT sorted.");
		}
	}

	// Function to check if array is sorted in ascending order
	public static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false; // If any element is greater than next → not sorted
			}
		}
		return true;
	}
}
