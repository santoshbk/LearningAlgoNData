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
			int pointer = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[pointer]) {
					pointer = j;
				}
			}
			int small = arr[pointer]; 
            arr[pointer] = arr[i];
            arr[i] = small;
		}
	}

}
