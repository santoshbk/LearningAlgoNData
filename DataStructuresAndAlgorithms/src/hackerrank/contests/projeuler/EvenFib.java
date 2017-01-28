package hackerrank.contests.projeuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenFib {

	public static void main(final String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			long n = in.nextLong();
			System.out.println(findSum(n));
		}
	}

	static List<Long> list = new ArrayList<>();
	static {
		list.add(new Long(1));
		list.add(new Long(2));
	}

	private static Long findSum(final Long n) {
		int l = list.size();
		if (list.get(l - 1) >= n) {
			return getSum(n);
		} else {
			int i = l - 1;
			while (true) {
				Long k = list.get(i) + list.get(i - 1);
				if (k <= n) {
					list.add(k);
				} else {
					break;
				}
				i++;
			}
			return getSum(n);
		}
	}

	private static Long getSum(final long i) {
		long sum = 0;
		for (long num : list) {
			if (num <= i) {
				if (num % 2 == 0) {
					sum += num;
				}
			} else {
				break;
			}
		}
		return sum;
	}
}
