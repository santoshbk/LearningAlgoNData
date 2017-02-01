package hackerearth.practice.BasicProg.io;

import java.util.Scanner;

public class FindProduct {
	public static void main(final String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = s.nextInt();
		}
		long ans = 1;
		long j = 1000000007;

		for (int i : a) {
			ans = (ans * i) % j;
		}
		System.out.println(ans);
	}
}
