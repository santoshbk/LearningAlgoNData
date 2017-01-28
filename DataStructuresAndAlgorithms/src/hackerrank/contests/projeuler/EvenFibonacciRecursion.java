package hackerrank.contests.projeuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenFibonacciRecursion {

	public static void main(final String[] args) {
		long t1 = System.currentTimeMillis();
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			long n = in.nextLong();
			System.out.println(findSum(n));
		}
		long t2 = System.currentTimeMillis();
		System.out.println((t2 - t1) / 1000);

	}

	static List<Long> list = new ArrayList<>();
	static int val = 2;

	private static long findSum(final long i) {
		if (!list.isEmpty() && list.get(list.size() - 1) > i) {
			return getSum(i);
		}

		int k = val;
		while (true) {
			long x = fib(k);
			if (x <= i) {
				if (x % 2 == 0) {
					list.add(x);
				}
				if (x == i) {
					break;
				}
			} else {
				break;
			}
			k += 3;
			val = k;
		}
		return getSum(i);
	}

	private static long getSum(final long i) {
		long sum = 0;
		for (long num : list) {
			if (num <= i) {
				sum += num;
			} else {
				break;
			}
		}
		return sum;
	}

	private static long fib(final long n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return fib(n - 1) + fib(n - 2);
	}
}
