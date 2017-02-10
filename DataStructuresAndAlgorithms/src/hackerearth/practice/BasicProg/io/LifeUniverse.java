package hackerearth.practice.BasicProg.io;

import java.util.Scanner;

public class LifeUniverse {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			int N = s.nextInt();
			if (N == 42) {
				break;
			}
			System.out.println(N);
		}
	}
}
