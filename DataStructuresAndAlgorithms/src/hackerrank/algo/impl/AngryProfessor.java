package hackerrank.algo.impl;

import java.util.Scanner;

public class AngryProfessor {

    @SuppressWarnings("resource")
    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	for (int a0 = 0; a0 < t; a0++) {
	    int n = in.nextInt();
	    int k = in.nextInt();
	    int a[] = new int[n];
	    for (int a_i = 0; a_i < n; a_i++) {
		a[a_i] = in.nextInt();
	    }
	    System.out.println(classPossibility(a, k));
	}
    }

    static String classPossibility(final int[] a, final int k) {
	int count = 0;
	for (int i : a) {
	    if (i <= 0) {
		count++;
	    }
	}
	if (count >= k) {
	    return "NO";
	} else {
	    return "YES";
	}

    }

}
