package sortingAlgoUsingArray;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 23, -2, 2, 6, 10, -1, 5 };
		int len = arr.length;

		while (len > 0) {
			int index = 0;
			int max = 0;
			int swap = 0;
			//find max index
			for (int i = 0; i < len; i++) {
				if (arr[i] > max) {
					max = arr[i];
					index = i;
				}
			}
			//swap last no with that index
			swap = arr[index];
			arr[index] = arr[len - 1];
			arr[len - 1] = swap;
			len--;
		}
		Arrays.stream(arr).forEach(System.out::println);

	}

}
