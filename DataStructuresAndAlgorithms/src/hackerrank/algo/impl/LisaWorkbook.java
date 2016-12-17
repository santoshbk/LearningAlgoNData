package hackerrank.algo.impl;

import java.util.Scanner;

public class LisaWorkbook {

    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int k = in.nextInt();
	int[] arr = new int[n];
	for (int i = 0; i < n; i++) {
	    arr[i] = in.nextInt();
	}
	solution1(arr, k);
	in.close();
    }

    private static void solution1(final int[] arr, final int k) {
	int page = 0;
	int splProb = 0;
	for (int i : arr) {
	    page++;
	    for (int j = 1; j <= i; j++) {
		if (page == j) {
		    splProb++;
		}
		if ((j != i) && ((j % k) == 0)) {
		    page++;
		}
	    }

	}
	System.out.println(splProb);
    }
}
