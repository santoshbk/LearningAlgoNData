package hackerearth.practice.BasicProg.io;

import java.util.Scanner;

public class Factorial {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(fact(n));
	}

	private static long fact(final int k) {
		if (k == 1) {
			return 1;
		}
		return k * fact(k - 1);
	}

}
