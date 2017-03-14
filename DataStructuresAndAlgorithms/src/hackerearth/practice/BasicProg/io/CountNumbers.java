package hackerearth.practice.BasicProg.io;

import java.util.Scanner;

public class CountNumbers {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		while (N-- > 0) {
			int l = s.nextInt();
			s.nextLine();
			String str = s.nextLine();
			int count = 0;
			// boolean flagChar = false;
			boolean flagDigit = false;
			for (int i = 0; i < l; i++) {
				char c = str.charAt(i);
				if (Character.isDigit(c)) {
					if (!flagDigit) {
						count++;
						flagDigit = true;
					}
				} else {
					flagDigit = false;
				}
			}
			System.out.println(count);
		}
	}

}
