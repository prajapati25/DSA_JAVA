package sortingAlgoUsingArray;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 5, -2, 100, 10, -6 };
		int n = arr.length;
		while (n > 0) {
			for (int i = 0; i < n-1; i++) {
				if (arr[i] > arr[i + 1]) {

					int b = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = b;
				}
			}
			n--;
		}
		
		System.out.println(Arrays.toString(arr));
	}
//avoid bubble sort when you have larger no of elements 
//
}