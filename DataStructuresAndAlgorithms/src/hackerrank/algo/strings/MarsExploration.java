package hackerrank.algo.strings;

import java.util.Scanner;

public class MarsExploration {
	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		final String s = in.nextLine();
		int k = 1;
		int count = 0;
		for (final char c : s.toCharArray()) {

			if (k == 1) {
				if (c != 'S') {
					count++;
				}
			} else if (k == 2) {
				if (c != 'O') {
					count++;
				}
			} else {
				if (c != 'S') {
					count++;
				}
			}
			if (k % 3 == 0) {
				k = 1;
			} else {
				k++;
			}
		}
		System.out.println(count);
	}
}
