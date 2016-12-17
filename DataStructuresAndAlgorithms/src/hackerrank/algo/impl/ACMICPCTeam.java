package hackerrank.algo.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ACMICPCTeam {

    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int m = in.nextInt();
	String topic[] = new String[n];
	for (int i = 0; i < n; i++) {
	    topic[i] = in.next();
	}
	in.close();
	List<int[]> a = convertToArray(topic, n, m);
	calculate(a, n, m);
    }

    private static void calculate(final List<int[]> arr, final int n, final int m) {
	int maxSum = 0;
	int count = 0;
	for (int i = 0; i < n; i++) {
	    for (int j = i + 1; j < n; j++) {
		if (i == (n - 1)) {
		    break;
		}
		int[] c = xor(arr.get(i), arr.get(j), m);
		int sum = sum(c);
		if (sum == maxSum) {
		    count++;
		}
		if (maxSum < sum) {
		    maxSum = sum;
		    count = 1;
		}
	    }
	}
	System.out.println(maxSum);
	System.out.println(count);
    }

    private static int[] xor(final int[] a, final int[] b, final int m) {
	int[] c = new int[m];
	for (int k = 0; k < m; k++) {
	    c[k] = a[k] | b[k];
	}
	return c;
    }

    private static int sum(final int[] a) {
	int sum = 0;
	for (int i : a) {
	    sum += i;
	}
	return sum;
    }

    static void display(final List<int[]> a) {
	for (int[] is : a) {
	    for (int i = 0; i < is.length; i++) {
		System.out.print(is[i] + " ");
	    }
	    System.out.println();
	}
    }

    private static List<int[]> convertToArray(final String[] a, final int n, final int m) {
	List<int[]> list = new ArrayList<>();
	for (int i = 0; i < n; i++) {
	    int[] arr = new int[m];
	    String s = a[i];
	    for (int j = 0; j < arr.length; j++) {
		arr[j] = Integer.parseInt("" + s.charAt(j));
	    }
	    list.add(arr);
	}
	return list;
    }

}
