package hackerrank.ds.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlgorithmicCrush {
	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		// solution1(in);
		solution2(in);
	}

	private static void solution2(final Scanner in) {
		int n = in.nextInt();
		int m = in.nextInt();
		List<Long> list = new ArrayList<>();
		long max = 0;
		int size = 0;
		while (m-- > 0) {
			int a = in.nextInt();
			int b = in.nextInt();
			long k = in.nextInt();

			if (size < b) {
				for (int i = size; i < b; i++) {
					list.add(0l);
					size++;
				}
			}
			for (int i = a - 1; i < b; i++) {
				long x = list.get(i) + k;
				max = Math.max(x, max);
				list.set(i, x);
			}
		}
		System.out.println(max);
	}

	private static void solution1(final Scanner in) {
		int n = in.nextInt();
		int m = in.nextInt();
		long[] arr = new long[n];
		long max = 0;
		while (m-- > 0) {
			int a = in.nextInt();
			int b = in.nextInt();
			int k = in.nextInt();
			for (int i = a - 1; i < b; i++) {
				long x = arr[i] + k;
				arr[i] = x;
				max = Math.max(x, max);
			}
		}
		in.close();
		System.out.println(max);
	}
}
