package hackerrank.algo.impl;

import java.util.Scanner;

/**
 * Created by kumbar on 5/7/2016.
 */
public class FindDigits {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			findDigits(n);
		}
	}

	static void findDigits(final int n) {
		int d = n;
		int count = 0;
		while (d > 0) {
			int r = d % 10;
			if (r == 0) {
				d /= 10;
				continue;
			}
			if (n % r == 0) {
				count++;
			}
			d /= 10;
		}
		System.out.println(count);
	}

}
