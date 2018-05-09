package hackerrank.ds.arrays;

import java.util.Scanner;

public class ArrayManipulation {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] arr = new long[n];
		int m = in.nextInt();
		long max = Long.MIN_VALUE;
		for (int a0 = 0; a0 < m; a0++) {
			int a = in.nextInt();
			a--;
			int b = in.nextInt();
			b--;
			int k = in.nextInt();
			for (int i = a; i <= b; i++) {
				arr[i] += k;
				long j = arr[i];
				max = j < max ? max : j;
			}
		}
		System.out.println(max);
		in.close();
	}
}
