package hackerrank.algo.impl;

import java.util.Scanner;

public class DivisibleSumPairs {
    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int k = in.nextInt();
	int[] a = new int[n];
	for (int a_i = 0; a_i < n; a_i++) {
	    a[a_i] = in.nextInt();
	}
	in.close();
	int sum = 0;
	for (int i = 0; i < n; i++) {
	    for (int j = i + 1; j < n; j++) {
		if (((a[i] + a[j]) % k) == 0) {
		    sum++;
		}
	    }
	}
	System.out.println(sum);
    }
}
