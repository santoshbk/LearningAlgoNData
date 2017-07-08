package hackerearth.practice.BasicProg.io;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BirthdayCandle {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] a = new int[N];
		int max = Integer.MIN_VALUE;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int x = s.nextInt();
			if (map.containsKey(x)) {
				map.put(x, map.get(x) + 1);
			} else {
				map.put(x, 1);
			}
			max = x > max ? x : max;
			a[i] = x;
		}
		System.out.println(map.get(max));
	}
}
