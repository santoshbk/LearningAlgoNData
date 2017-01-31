package hackerearth.practice.BasicProg.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMax {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int min = 0;
		int max = 0;
		int[] a = new int[7];
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int k = s.nextInt();
			min = i == 0 ? k : Math.min(min, k);
			max = i == 0 ? k : Math.max(max, k);
			list.add(k);
		}
		for (int i = min; i <= max; i++) {
			if (!list.contains(i)) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

	}

}
