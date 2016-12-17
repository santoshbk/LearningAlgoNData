package hackerrank.algo.strings;

import java.util.Arrays;
import java.util.Scanner;

public class GameOfThrones1 {

    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	String s = in.nextLine();
	in.close();
	s = s.trim();
	solution(s);
    }

    private static void solution(final String s) {
	int[] a = new int[26];
	Arrays.fill(a, -1);
	int len = s.length();
	for (int i = 0; i < len; i++) {
	    int k = s.charAt(i) - 97;
	    if (a[k] == -1) {
		a[k] = 1;
	    } else {
		a[k] += 1;
	    }
	}
	int oddCount = 0;
	for (int i : a) {
	    if (i == -1) {
		continue;
	    }
	    if ((i % 2) == 1) {
		oddCount++;
	    }
	}
	if ((len % 2) == 0) {
	    if (oddCount == 0) {
		System.out.println("YES");
	    } else {
		System.out.println("NO");
	    }
	} else {
	    if (oddCount <= 1) {
		System.out.println("YES");
	    } else {
		System.out.println("NO");
	    }
	}

    }
}
