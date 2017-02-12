package hackerrank.algo.impl;

import java.util.Scanner;

public class Between2Sets {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int k = in.nextInt();
			a[i] = k;
			max = Math.max(max, k);
		}
		for (int i = 0; i < m; i++) {
			int k = in.nextInt();
			b[i] = k;
			min = Math.min(min, i);
		}
		in.close();
		for (int i = 0; i < n; i++) {
			// if()

		}
	}

}
