package Sep13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeaderInArray {

	public static int[] Leader(int[] arr) {
		int len = arr.length;
		ArrayList<Integer> leader = new ArrayList<>();
		int maxleader = arr[arr.length - 1];
		leader.add(maxleader);

		for (int i = len - 2; i >= 0; i--) {
			if (arr[i] >= maxleader) {
				maxleader=arr[i];
				leader.add(maxleader);
			}
		}
		
		
		Collections.reverse(leader);
		
		int [] array = new int [leader.size()];
		for(int i=0;i<leader.size();i++) {
			array[i]=leader.get(i);
		}
		return array;

	}

	public static void main(String[] args) {
		int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};

		System.out.println("Before: " + Arrays.toString(arr));
		int [] arr2 = Leader(arr);
		System.out.println("After:  " + Arrays.toString(arr2));
	}
}
