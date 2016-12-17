package hackerrank.algo.impl;

import java.util.Scanner;

public class MinMaxSum {

    public static void main(final String[] args) {
	final Scanner in = new Scanner(System.in);
	final long a[] = new long[5];
	for (int i = 0; i < 5; i++) {
	    a[i] = in.nextLong();
	}
	in.close();
	long min = 0;
	long max = 0;
	for (int i = 0; i < 5; i++) {
	    long temp = 0;
	    for (int j = 0; j < 5; j++) {
		if (i == j) {
		    continue;
		}
		temp += a[j];
	    }
	    if (i == 0) {
		min = temp;
		max = temp;
	    }
	    min = (min > temp) ? temp : min;
	    max = (max < temp) ? temp : max;
	}
	System.out.println(min + " " + max);

    }

}
