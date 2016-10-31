package santosh.algorithms.hackerrank;

import static santosh.java.util.Utils.closeScanner;
import static santosh.java.util.Utils.getScanner;

import java.util.Scanner;

public class ApplesAndOranges {

    public static void main(final String[] args) {
	Scanner in = getScanner();
	int s = in.nextInt();
	int t = in.nextInt();
	int a = in.nextInt();
	int b = in.nextInt();
	int m = in.nextInt();
	int n = in.nextInt();
	int[] apple = new int[m];
	for (int i = 0; i < m; i++) {
	    apple[i] = in.nextInt();
	}
	int[] orange = new int[n];
	for (int i = 0; i < n; i++) {
	    orange[i] = in.nextInt();
	}
	int totalApples = 0;
	int totalOrages = 0;
	for (int i : apple) {
	    if (isInside(i + a, s, t)) {
		totalApples++;
	    }
	}
	for (int i : orange) {
	    if (isInside(i + b, s, t)) {
		totalOrages++;
	    }
	}
	System.out.println(totalApples);
	System.out.println(totalOrages);
	closeScanner(in);
    }

    private static boolean isInside(final int i, final int s, final int t) {
	if ((i >= s) && (i <= t)) {
	    return true;
	}
	return false;
    }

}
