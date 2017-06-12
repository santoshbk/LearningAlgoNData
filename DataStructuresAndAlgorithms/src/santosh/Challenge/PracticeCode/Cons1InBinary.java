package santosh.Challenge.PracticeCode;

import java.util.Scanner;

public class Cons1InBinary {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int count = 0;
		int maxCount = 0;
		while (k > 0) {
			int x = k % 2;
			if (x == 1) {
				count++;
				maxCount = count > maxCount ? count : maxCount;
			} else {
				count = 0;
			}
			k = k / 2;
		}
		System.out.println(maxCount);
	}

}
