package com;

import java.util.Arrays;
import java.util.Scanner;

public class KillMonster {
	static int getMaxMonsters(final int n, final int hit, int t, final int[] h) {
		Arrays.sort(h);
		int kill = 0;
		for (int k : h) {
			while (k > 0) {
				k -= hit;
				t--;
				if (t <= 0) {
					break;
				}
			}
			if (k <= 0) {
				kill++;
			}
			if (t <= 0) {
				break;
			}
		}
		return kill;
	}

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int hit = in.nextInt();
		int t = in.nextInt();
		int[] h = new int[n];
		for (int h_i = 0; h_i < n; h_i++) {
			h[h_i] = in.nextInt();
		}
		int result = getMaxMonsters(n, hit, t, h);
		System.out.println(result);
	}
}
