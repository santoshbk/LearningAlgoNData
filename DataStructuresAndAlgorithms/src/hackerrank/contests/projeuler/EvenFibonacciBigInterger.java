package hackerrank.contests.projeuler;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;
import static java.math.BigInteger.valueOf;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenFibonacciBigInterger {

	public static void main(final String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			long n = in.nextLong();
			System.out.println(findSum(valueOf(n)));
		}
	}

	static List<BigInteger> list = new ArrayList<>();
	static {
		list.add(ONE);
		list.add(valueOf(2));
	}

	private static BigInteger findSum(final BigInteger n) {
		int l = list.size();
		if (isFirstBiggerorEqual(list.get(l - 1), n)) {
			return getSum();
		} else {
			int i = l - 1;
			while (true) {
				BigInteger k = list.get(i).add(list.get(i - 1));
				if (!isFirstBiggerorEqual(k, n)) {
					list.add(k);
				} else {
					break;
				}
				i++;
			}
			return getSum();
		}
	}

	private static boolean isFirstBiggerorEqual(final BigInteger a, final BigInteger b) {
		if (a.compareTo(b) == -1) {
			return false;
		}
		return true;
	}

	private static BigInteger getSum() {
		BigInteger sum = ZERO;
		for (BigInteger num : list) {
			if (num.remainder(valueOf(2)) == ZERO) {
				sum = sum.add(num);
			}
		}
		return sum;
	}

}
