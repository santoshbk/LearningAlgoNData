package santosh.algorithms.sorting.quick;

public class TestQuick {

	public static void main(String[] args) {
		int[] arr = { 12, 56, 67, 43, 1, 45, 32, 54, 67, 87, 34, 23 };
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		quickSortingArray(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	static void quickSortingArray(int[] arr) {
		int len = arr.length;
		int first = 0;
		int last = len - 1;
	}

	static void quickSort(int[] a, int first, int last) {
		System.out.println("Cool");
	}

}
