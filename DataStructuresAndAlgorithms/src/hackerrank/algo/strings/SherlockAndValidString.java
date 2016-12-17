package hackerrank.algo.strings;

import static java.util.Arrays.fill;

import java.util.Scanner;

public class SherlockAndValidString {

    public static void main(final String[] args) {

	Scanner in = new Scanner(System.in);
	String s = in.nextLine();
	in.close();
	s = s.trim();

	int[] a = new int[26];
	fill(a, -1);
	for (int i = 0; i < s.length(); i++) {
	    int k = s.charAt(i) - 97;
	    if (a[k] == -1) {
		a[k] = 1;
	    } else {
		a[k] += 1;
	    }
	}
	int x = getFirstElement(a);
	int y = getSecondElement(a);
	int fcount = 0;
	int scount = 0;
	if (fcount < scount) {
	    for (int i : a) {
		if ((y != i) && (i != -1)) {
		    scount++;
		}
	    }
	    if (scount > 1) {
		System.out.println("NO");
	    } else {
		System.out.println("YES");
	    }
	} else {
	    for (int i : a) {
		if ((x != i) && (i != -1)) {
		    fcount++;
		}
	    }
	    if (fcount > 1) {
		System.out.println("NO");
	    } else {
		System.out.println("YES");
	    }
	}
    }

    private static int getFirstElement(final int[] a) {
	int n = a[0];
	if (n != -1) {
	    return n;
	}
	for (int i : a) {
	    if (i != -1) {
		n = i;
		break;
	    }
	}
	return n;
    }

    private static int getSecondElement(final int[] a) {
	int f = 0;
	int s = 0;
	for (int i : a) {
	    if (i != -1) {
		f = i;
		break;
	    }
	}
	for (int i : a) {
	    if ((i != -1) && (i != f)) {
		s = i;
		break;
	    }
	}
	return s;
    }
}
