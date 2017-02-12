package hackerrank.algo.impl;

import java.util.Scanner;

public class JarvinAndSevenSegments {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int l = in.nextInt();
			int[] a = new int[l];
			for (int i = 0; i < l; i++) {
				a[i] = in.nextInt();
			}
			System.out.println(printSolution(a));
		}
		in.close();
	}

	private static int get(final int i) {
		if (i == 1) {
			return 2;
		} else if (i == 2) {
			return 5;
		} else if (i == 3) {
			return 5;
		} else if (i == 4) {
			return 4;
		} else if (i == 5) {
			return 5;
		} else if (i == 6) {
			return 6;
		} else if (i == 7) {
			return 3;
		} else if (i == 8) {
			return 7;
		} else if (i == 9) {
			return 6;
		} else {
			return 6;
		}
	}

	private static int getVal(final int i) {
		if (i > 9) {
			int k = i;
			int sum = 0;
			while (k != 0) {
				int r = k % 10;
				k = k / 10;
				sum += get(r);
			}
			return sum;
		} else {
			return get(i);
		}
	}

	private static int printSolution(final int[] a) {
		int minSum = -1;
		int minNum = -1;
		for (int i : a) {
			if (minNum == -1) {
				minNum = i;
				minSum = getVal(i);
			} else {
				int k = getVal(i);
				if (minSum > k) {
					minSum = k;
					minNum = i;
				}
			}
		}
		return minNum;
	}

}
