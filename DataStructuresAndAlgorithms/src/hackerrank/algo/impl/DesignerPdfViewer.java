package hackerrank.algo.impl;

import java.util.Scanner;

public class DesignerPdfViewer {

    @SuppressWarnings("resource")
    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int n = 26;
	int h[] = new int[n];
	for (int h_i = 0; h_i < n; h_i++) {
	    h[h_i] = in.nextInt();
	}
	String word = in.next();
	char[] c = word.toCharArray();
	int max = 0;
	for (char d : c) {
	    int i = h[d - 97];
	    if (max < i) {
		max = i;
	    }
	}
	System.out.println(c.length * max);
    }

}
