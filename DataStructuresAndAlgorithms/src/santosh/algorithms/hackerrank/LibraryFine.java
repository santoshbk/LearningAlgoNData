package santosh.algorithms.hackerrank;

import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d1 = in.nextInt();
		int m1 = in.nextInt();
		int y1 = in.nextInt();
		int d2 = in.nextInt();
		int m2 = in.nextInt();
		int y2 = in.nextInt();
		in.close();
		if (y2 < y1) {
			System.out.println(10000);
			return;
		}
		if (y2 > y1) {
			System.out.println(0);
			return;
		}
		if (m2 < m1) {
			System.out.println(500 * Math.abs((m2 - m1)));
			return;
		}
		if (m2 > m1) {
			System.out.println(0);
			return;
		}
		if (d2 < d1) {
			System.out.println(15 * Math.abs((d2 - d1)));
			return;
		}
		System.out.println(0);
	}

}
