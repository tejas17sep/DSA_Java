package Sep09;

public class SecondLargestElementInArrat {
	public static int findSecondLargest(int[] a) {
		if (a.length < 2) {
			throw new IllegalArgumentException("Array must have at least 2 elements");
		}

		int max1, max2;

		// Step 1: Initialize first two elements
		if (a[0] > a[1]) {
			max1 = a[0];
			max2 = a[1];
		} else {
			max1 = a[1];
			max2 = a[0];
		}

		// Step 2: Iterate remaining elements
		for (int i = 2; i < a.length; i++) {
			if (a[i] > max1) {
				max2 = max1;
				max1 = a[i];
			} else if (a[i] > max2 && a[i] != max1) {
				max2 = a[i];
			}
		}

		return max2;
	}

	public static void main(String[] args) {
		int[] numbers = { 25, 16, 34, 10, 50, 50 };

		int secondLargest = findSecondLargest(numbers);

		System.out.println("Second Largest element: " + secondLargest);
	}
}
