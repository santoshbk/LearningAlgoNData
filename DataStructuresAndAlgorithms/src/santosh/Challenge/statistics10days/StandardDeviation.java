package santosh.Challenge.statistics10days;

import static santosh.java.util.Utils.closeScanner;
import static santosh.java.util.Utils.getScanner;

import java.util.Scanner;

public class StandardDeviation {
    public static void main(final String[] args) {
	Scanner in = getScanner();
	int n = in.nextInt();
	int[] arr = new int[n];
	for (int i = 0; i < n; i++) {
	    arr[i] = in.nextInt();
	}
	closeScanner(in);
    }
}
