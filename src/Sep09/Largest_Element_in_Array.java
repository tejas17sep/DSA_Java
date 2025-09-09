package Sep09;

public class Largest_Element_in_Array {
	
    // Function to find the largest element
    public static int findLargest(int[] arr) {
        int max = arr[0]; // assume first element is largest
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23, 56};

        int largest = findLargest(numbers);

        System.out.println("Largest element in the array is: " + largest);
    }
}
