package techgig.practise;

import java.util.Scanner;

public class CountBigger {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int k = in.nextInt();

		int count = 0;
		for (int i : a) {
			if (i > k) {
				count++;
			}
		}
		System.out.println(count);
	}

}
