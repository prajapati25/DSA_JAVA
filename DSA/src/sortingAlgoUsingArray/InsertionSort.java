package sortingAlgoUsingArray;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 23, 45, -68, 0, 23, 2 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i - j] < arr[i - j - 1]) {
					int c = arr[i - j];
					arr[i - j] = arr[i - j - 1];
					arr[i - j - 1] = c;
				}

			}

		}
		for (int a : arr) {
			System.out.println(a);
		}
	}

}
