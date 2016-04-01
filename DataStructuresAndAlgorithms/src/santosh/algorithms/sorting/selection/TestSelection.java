package santosh.algorithms.sorting.selection;

public class TestSelection {

	public static void main(String[] args) {
		int[] arr = { 12, 56, 67, 43, 1, 45, 32, 54, 67, 87, 34, 23 };
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		selectionSortingArray(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	static void selectionSortingArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int small = arr[i + 1];
			int pointer = i + 1;
			for (int j = i + 2; j < arr.length - 2; j++) {
				if (small > arr[j]) {
					small = arr[j];
					pointer = j;
				}
			}
			if (arr[i] > small) {
				int temp = arr[i];
				arr[i] = small;
				small = temp;
			}
		}
	}

}
