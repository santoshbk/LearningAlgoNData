package techgig.practise;

import java.util.Scanner;

public class BiggestDiff {

	public static void main(final String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			int k = a[i];
			max = max < k ? k : max;
			min = min < k ? min : k;
		}
		System.out.print(max - min);

	}

}
