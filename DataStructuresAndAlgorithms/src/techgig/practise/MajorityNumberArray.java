package techgig.practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityNumberArray {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : a) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		int max = 0;
		int num = 0;
		for (int i : map.keySet()) {
			int k = map.get(i);
			if (k > max) {
				num = i;
				max = k;
			}
		}
		if (max > n / 2) {
			System.out.println(num);
		} else {
			System.out.println(-1);
		}
	}

}
