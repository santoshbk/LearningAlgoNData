package techgig.practise;

import java.util.Scanner;

public class CountCouples {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int k = in.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			int p = a[i];
			for (int j = i + 1; j < n; j++) {
				if (p + a[j] == k) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
