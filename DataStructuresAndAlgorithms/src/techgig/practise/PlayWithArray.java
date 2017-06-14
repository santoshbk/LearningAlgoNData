package techgig.practise;

import java.util.Arrays;
import java.util.Scanner;

public class PlayWithArray {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int[] b = Arrays.copyOf(a, n);

		for (int i = 0; i < 2; i++) {
			for (int j = i + 1; j < n; j++) {
				int k = a[i];
				int m = a[j];
				if (k < m) {
					a[j] = k;
					a[i] = m;
				}
			}
		}
		System.out.print(a[0] + " " + a[1]);
		if (n > 1) {
			for (int i = 0; i < n; i++) {
				int k = b[i];
				if (k == a[0] || k == a[1]) {
					continue;
				}
				System.out.print(" ");
				System.out.print(b[i]);
			}
		}

	}

}
