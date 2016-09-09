package santosh.Challenge.statistics10days;

import java.util.Scanner;

public class WeightedMean {

    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	int[] X = new int[N];
	int[] W = new int[N];
	for (int i = 0; i < N; i++) {
	    X[i] = in.nextInt();
	}
	for (int i = 0; i < N; i++) {
	    W[i] = in.nextInt();
	}
	in.close();
	long sumXW = 0;
	long sumW = 0;
	for (int i = 0; i < N; i++) {
	    sumXW += X[i] * W[i];
	    sumW += W[i];
	}
	System.out.printf("%.1f%n", (sumXW * 1.0) / sumW);
    }
}
