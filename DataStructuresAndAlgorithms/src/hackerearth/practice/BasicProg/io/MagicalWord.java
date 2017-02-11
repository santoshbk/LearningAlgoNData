package hackerearth.practice.BasicProg.io;

import java.util.Scanner;

public class MagicalWord {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int l = in.nextInt();
		in.nextLine();
		while (t-- > 0) {
			String s = in.nextLine();
			for (int i = 0; i < l; i++) {
				int x = s.charAt(i);
				if (isPrime(x)) {
					char c = (char) x;
					System.out.print(c);
				} else {
					char c = (char) getPrime(x);
					System.out.print(c);
				}
			}

		}
	}

	private static int getPrime(final int x) {
		int max = x + 1;
		int min = x - 1;
		while (true) {
			if (isPrime(max)) {
				break;
			} else {
				max++;
			}
		}
		while (true) {
			if (isPrime(min)) {
				break;
			} else {
				min--;
			}
		}
		int minD = x - min;
		int maxD = max - x;
		if (minD - maxD > 0) {
			return max;
		} else {
			return min;
		}

	}

	private static boolean isPrime(final int x) {
		if (x == 2) {
			return true;
		}
		if (x % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= x; i += 2) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

}
