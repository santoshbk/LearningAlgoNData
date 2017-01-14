package hackerrank.algo.impl;

import java.util.Scanner;

public class JumpClouds {

    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int k = in.nextInt();
	short[] a = new short[n];
	for (int i = 0; i < n; i++) {
	    a[i] = in.nextShort();
	}
	in.close();
	int e = 100;
	for (int i = 0; i < n; i += k) {
	    if (a[i] == 0) {
		e--;
	    } else {
		e -= 3;
	    }
	}
	System.out.println(e);
    }

}
