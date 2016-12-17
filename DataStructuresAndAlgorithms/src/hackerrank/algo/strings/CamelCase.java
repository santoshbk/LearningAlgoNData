package hackerrank.algo.strings;

import java.util.Scanner;

public class CamelCase {

    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	String s = in.nextLine();
	int count = 1;
	for (Character c : s.toCharArray()) {
	    int cc = c;
	    if (!((cc > 96) && (cc < 123))) {
		count++;
	    }
	}
	System.out.println(count);
    }

}
