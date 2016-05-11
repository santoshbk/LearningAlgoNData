package santosh.Challenge.domains.java;

import java.util.Scanner;

public class Datatypes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			try {
				long n = in.nextLong();
				System.out.println(n + " can be fitted in:");
				if (Byte.MIN_VALUE <= n && n <= Byte.MAX_VALUE) {
					System.out.println("* byte");
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
					continue;
				}
				if (Short.MIN_VALUE <= n && n <= Short.MAX_VALUE) {
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
					continue;
				}
				if (Integer.MIN_VALUE <= n && n <= Integer.MAX_VALUE) {
					System.out.println("* int");
					System.out.println("* long");
					continue;
				}
				if (Long.MIN_VALUE <= n && n <= Long.MAX_VALUE) {
					System.out.println("* long");
					continue;
				}
			} catch (Exception e) {
				System.out.println(in.next() + " can't be fitted anywhere.");
			}
		}
	}

}
