package hackerrank.algo.impl;

import java.util.Scanner;

public class GradingStudents {

	private static int calculateGrade(int i) {
		if (i < 38) {
			return i;
		}
		int k = i % 5;
		if (k > 2) {
			return i + 5 - k;
		}

		return i;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int a[] = new int[t];
		for (int i = 0; i < t; i++) {
			a[i] = in.nextInt();
		}
		for (int i : a) {
			System.out.println(calculateGrade(i));
		}
	}

}
