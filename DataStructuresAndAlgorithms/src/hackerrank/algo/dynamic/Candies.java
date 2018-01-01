package hackerrank.algo.dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class Candies {

	static int candies(final int n, final int[] arr) {
		Arrays.sort(arr);
		int len = arr.length;
		int num = arr[0];
		int can = 1;
		int sum = can;
		for (int i = 1; i < len; i++) {
			if (num != arr[i]) {
				can++;
			}
			sum += can;
		}
		return sum;
	}

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int result = candies(n, arr);
		System.out.println(result);
		in.close();
	}

}
