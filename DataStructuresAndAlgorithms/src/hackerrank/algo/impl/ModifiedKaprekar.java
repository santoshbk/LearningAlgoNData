package hackerrank.algo.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ModifiedKaprekar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int q = in.nextInt();
		in.close();
		solution(p, q);
	}

	private static void solution(int pp, int qq) {
		List<Integer> list = new ArrayList<>();
		for (int i = pp; i <= qq; i++) {
			if (kaprekar(i)) {
				list.add(i);
			}
		}
		if (list.size() == 0) {
			System.out.println("INVALID RANGE");
		} else {
			for (Integer i : list) {
				System.out.println(i + " ");
			}
		}
	}

	private static boolean kaprekar(int n) {
		if (n == 0)
			return true;
		if (n == 1)
			return true;
		long kk = (long) Math.pow(n, 2);
		int[] nn = intToArray(n);
		int d = nn.length;
		int[] arr = intToArray(kk);
		int len = arr.length;
		int sum = arrayToInt(Arrays.copyOfRange(arr, d, len)) + arrayToInt(Arrays.copyOfRange(arr, 0, d));
		;
		if (sum == n)
			return true;
		/*
		 * for (int i = 0; i < arr.length - 1; i++) { int a =
		 * arrayToInt(Arrays.copyOfRange(arr, 0, i + 1)); if (a == 0) continue;
		 * int b = arrayToInt(Arrays.copyOfRange(arr, i + 1, arr.length)); if (b
		 * == 0) continue; int sum = a + b; if (sum == n) return true; }
		 */
		return false;
	}

	private static int[] intToArray(long n) {
		int[] a = getArray(100);
		int i = 0;
		while (n != 0) {
			a[i++] = (int) (n % 10.0);
			n /= 10;
		}
		for (int j = 0; j < a.length; j++) {
			if (a[j] == -1) {
				return Arrays.copyOfRange(a, 0, j);
			}
		}
		return a;
	}

	private static int[] getArray(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = -1;
		}
		return a;
	}

	private static int arrayToInt(int[] n) {
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum += (n[i] * Math.pow(10, i));
		}
		return sum;
	}

}
