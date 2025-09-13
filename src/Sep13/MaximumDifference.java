package Sep13;

public class MaximumDifference {

	public static int maxDiff(int[] arr) {
		int count = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {

				if (arr[j] - arr[i] > count) {
					count=arr[j] - arr[i];
				}
				
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 10, 6, 4, 8, 1 };

		int result = maxDiff(arr);
		System.out.println("Maximum Difference: " + result);
	}
}
