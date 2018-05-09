package hackerearth.challenges.CodeArena;

import java.util.Scanner;

public class SpecialSum {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		while (N-- > 0) {
			long l = s.nextLong();
			System.out.println(specialSum(l));
		}

	}

	private static long specialSum(final long l) {
		long sum = 0;

		for (int i = 1; i <= l; i++) {
			if (l % i == 0) {
				sum += foo(i);
			}
		}

		return sum;
	}

	private static long foo(final long N) {
		int num = 0;

		for (int i = 1; i <= N; i++) {
			if (gcd(N, i) == 1) {
				num += 1;
			}
		}
		return num;
	}

	private static long gcd(long n1, long n2) {
		while (n1 != n2) {
			if (n1 > n2) {
				n1 -= n2;
			} else {
				n2 -= n1;
			}
		}
		return n1;
	}

}
