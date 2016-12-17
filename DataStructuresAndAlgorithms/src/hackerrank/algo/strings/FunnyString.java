package hackerrank.algo.strings;

import java.util.Scanner;

public class FunnyString {

    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	in.nextLine();
	while (t-- > 0) {
	    String s = in.nextLine();
	    solution(s);
	}
	in.close();
    }

    private static void solution(final String s) {
	if (find(s)) {
	    System.out.println("Funny");
	} else {
	    System.out.println("Not Funny");
	}
    }

    private static boolean find(final String s) {
	String r = new StringBuilder(s).reverse().toString();
	for (int i = 1; i < (s.length() - 1); i++) {
	    int a = Math.abs(s.charAt(i) - s.charAt(i - 1));
	    int b = Math.abs(r.charAt(i) - r.charAt(i - 1));
	    if (a != b) {
		return false;
	    }
	}
	return true;
    }
}
