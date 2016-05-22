package santosh.algorithms.hackerrank;

import java.util.Scanner;

public class CeaserCipher {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String s = in.next();
		int k = in.nextInt();
		in.close();
		k = k % 26;
		for (int i = 0; i < n; i++) {
			System.out.println(rotateChar(s.charAt(i), k));
		}
	}

	private static char rotateChar(char c, int k) {

		int a = c;
		if (a <= 122 && a >= 97) {
			int d = a + k;
			if (d > 122) {
				int e = 122 - d;
				return (char) (96 - e);
			}
			return (char) d;
		} else if (a <= 90 && a >= 65) {
			int d = a + k;
			if (d > 90) {
				int e = 90 - d;
				return (char) (64 - e);
			}
			return (char) d;
		} else
			return c;

	}

}
