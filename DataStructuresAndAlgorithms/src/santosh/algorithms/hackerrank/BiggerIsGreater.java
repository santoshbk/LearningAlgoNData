package santosh.algorithms.hackerrank;

import static santosh.java.util.Utils.closeScanner;
import static santosh.java.util.Utils.getScanner;

import java.util.Scanner;

public class BiggerIsGreater {

    public static void main(final String[] args) {
	Scanner in = getScanner();
	int n = in.nextInt();
	String[] s = new String[n];
	for (int i = 0; i < n; i++) {
	    in.nextLine();
	    s[i] = in.next();
	}
	for (String string : s) {
	    System.out.println(nextPermutation(string));
	}
	closeScanner(in);
    }

    private static String nextPermutation(final String string) {
	int len = string.length();
	char[] c = string.toCharArray();
	char[] st = new char[len];
	for (int i = 0; i < len; i++) {
	    char a = c[i];
	    for (int j = 0; j < (len - 1);) {
		char b = c[j];
	    }

	}
	return null;
    }

}
