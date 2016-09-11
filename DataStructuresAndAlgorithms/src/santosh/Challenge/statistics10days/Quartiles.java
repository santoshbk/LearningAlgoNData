package santosh.Challenge.statistics10days;

import java.util.Arrays;
import java.util.Scanner;

public class Quartiles {
    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] array = new int[n];
	for (int i = 0; i < n; i++) {
	    array[i] = in.nextInt();
	}
	in.close();
	Arrays.sort(array);
	int q2 = (int) getMedian(array);
	int mid = n / 2;
	int[] arrayL = Arrays.copyOfRange(array, 0, mid);
	int[] arrayR = Arrays.copyOfRange(array, n - mid, n);
	int q1 = (int) getMedian(arrayL);
	int q3 = (int) getMedian(arrayR);
	System.out.println(q1);
	System.out.println(q2);
	System.out.println(q3);
    }

    private static double getMedian(final int[] array) {
	double median = 0;
	int length = array.length;
	if ((length % 2) == 0) {
	    median = (array[length / 2] + array[(length / 2) - 1]) / 2.0;
	} else {
	    median = array[length / 2];
	}
	return median;
    }
}
