package hackerrank.contests.projeuler;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Multi3And5 {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			System.out.println(findSum(n));
		}
	}

	static Set<Integer> set = new TreeSet<>();
	static int val = 0;
	static int xk = 1;
	static int yk = 1;

	private static long findSum(final int n) {
		if (!set.isEmpty() && val >= n) {
			return getSum(n);
		}
		while (true) {
			int x = 3 * xk;
			if (x >= n) {
				break;
			} else {
				set.add(x);
				val = Math.max(val, x);
			}
			xk++;
		}
		while (true) {
			if (yk % 3 == 0) {
				yk++;
				continue;
			}
			int y = 5 * yk;
			if (y >= n) {
				break;
			} else {
				set.add(y);
				val = Math.max(val, y);
			}
			yk++;
		}
		return getSum(n);
	}

	private static long getSum(final int i) {
		long sum = 0;
		for (int num : set) {
			if (num < i) {
				sum += num;
			} else {
				break;
			}
		}
		return sum;
	}

}
