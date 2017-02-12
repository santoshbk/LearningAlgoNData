package hackerrank.algo.impl;

import java.util.Scanner;

public class Kangaroo {
	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		if (x1 == x2) {
			System.out.println("YES");
			return;
		}
		int k1 = x1 + v1;
		int k2 = x2 + v2;
		while (true) {
			if (k1 != k2) {
				if (k1 > k2) {
					System.out.println("NO");
					break;
				}
			} else {
				System.out.println("YES");
				break;
			}
			k1+=v1;
			k2+=v2;
		}
	}
}
