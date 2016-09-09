package santosh.Challenge.domains.java;

import java.util.Scanner;

public class Datatypes {

    private static final String BYTE = "* byte";
    private static final String SHORT = "* short";
    private static final String INT = "* int";
    private static final String LONG = "* long";

    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int T = in.nextInt();
	for (int i = 0; i < T; i++) {
	    try {
		long n = in.nextLong();
		System.out.println(n + " can be fitted in:");

		if ((Byte.MIN_VALUE <= n) && (n <= Byte.MAX_VALUE)) {
		    System.out.println(BYTE);
		    System.out.println(SHORT);
		    System.out.println(INT);
		    System.out.println(LONG);
		    continue;
		}
		if ((Short.MIN_VALUE <= n) && (n <= Short.MAX_VALUE)) {
		    System.out.println(SHORT);
		    System.out.println(INT);
		    System.out.println(LONG);
		    continue;
		}
		if ((Integer.MIN_VALUE <= n) && (n <= Integer.MAX_VALUE)) {
		    System.out.println(INT);
		    System.out.println(LONG);
		    continue;
		}
		if ((Long.MIN_VALUE <= n) && (n <= Long.MAX_VALUE)) {
		    System.out.println(LONG);
		    continue;
		}
	    } catch (Exception e) {
		System.out.println(in.next() + " can't be fitted anywhere.");
	    }
	}
	in.close();
    }

}
