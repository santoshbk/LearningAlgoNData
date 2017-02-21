package hackerrank.algo.strings;

import java.util.Scanner;

public class BeautifulBinary {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();
		final String s = in.nextLine();
		in.close();
		int k = 1;
		int count = 0;
		for (int i = 0; i < t; i++) {
			char c = s.charAt(i);
			if (c == '0') {
				if (k == 1) {
					k++;
				} else if (k == 2) {
				} else {
					k = 1;
					count++;
				}
			} else {
				if (k == 2) {
					k++;
				} else {
					k = 1;
				}
			}
		}
		System.out.println(count);
	}

}
