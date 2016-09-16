package santosh.Challenge.statistics10days;

import static santosh.java.util.Common.getMedian;

import java.util.Arrays;
import java.util.Scanner;

public class InterQuartileRange {
    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	int[] X = new int[N];
	int[] F = new int[N];
	for (int i = 0; i < N; i++) {
	    X[i] = in.nextInt();
	}
	int sumF = 0;
	for (int i = 0; i < N; i++) {
	    int k = in.nextInt();
	    F[i] = k;
	    sumF += k;
	}
	in.close();
	int[] arr = new int[sumF];
	for (int i = 0, k = 0; i < N; i++) {
	    while (F[i]-- > 0) {
		arr[k++] = X[i];
	    }
	}
	Arrays.sort(arr);
	int mid = sumF / 2;
	int[] arrayL = Arrays.copyOfRange(arr, 0, mid);
	int[] arrayR = Arrays.copyOfRange(arr, sumF - mid, sumF);
	double l = getMedian(arrayL);
	double r = getMedian(arrayR);
	System.out.println(r - l);
    }
}
