package hackerrank.tutorials.ctci;

import java.util.Scanner;

public class LeftRotationArray {
	public static int[] arrayLeftRotation(final int[] a, final int n, final int k) {
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[(i - k) >= 0 ? i - k : i - k + n] = a[i];
		}
		return b;
	}

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		int[] output = new int[n];
		output = arrayLeftRotation(a, n, k);
		for (int i = 0; i < n; i++) {
			System.out.print(output[i] + " ");
		}

		System.out.println();

	}
}
