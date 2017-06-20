package techgig.practise;

import java.util.Scanner;

public class ThirdLargest {
	public static void main(final String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < n; j++) {
				int k = a[i];
				int m = a[j];
				if (k < m) {
					a[j] = k;
					a[i] = m;
				}
			}
		}
		System.out.print(a[2]);

	}
}
