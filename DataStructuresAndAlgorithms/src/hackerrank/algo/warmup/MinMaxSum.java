package hackerrank.algo.warmup;

import java.util.Scanner;

public class MinMaxSum {

	static void miniMaxSum(final int[] arr) {
		long sum = 0;
		for (int i : arr) {
			sum += i;
		}
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		for (int i : arr) {
			long temp = sum - i;
			min = min < temp ? min : temp;
			max = max < temp ? temp : max;
		}
		System.out.println(min + " " + max);
	}

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for (int arr_i = 0; arr_i < 5; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		miniMaxSum(arr);
		in.close();
	}

}
