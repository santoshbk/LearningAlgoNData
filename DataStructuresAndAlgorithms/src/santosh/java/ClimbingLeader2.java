package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClimbingLeader2 {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> scores = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			scores.add(in.nextInt());
		}
		int m = in.nextInt();
		for (int i = 0; i < m; i++) {
			int k = in.nextInt();
			System.out.println(getRank(k, scores, n));
		}
	}

	private static int getRank(final int k, final List<Integer> scores, final int len) {
		List<Integer> arr = new ArrayList<>();
		boolean flag = true;
		for (int i : scores) {
			if (k < i) {
				arr.add(i);
			} else {
				if (flag) {
					arr.add(k);
					arr.add(i);
					flag = false;
				} else {
					arr.add(i);
				}
			}
		}
		if (flag) {
			arr.add(k);
		}

		int r = 1;
		int z = arr.get(0);
		if (z == k) {
			return r;
		}
		for (int i = 1; i < len + 1; i++) {
			int y = arr.get(i);
			if (z != y) {
				r++;
				z = y;
			}
			if (y == k) {
				break;
			}
		}
		return r;
	}

}
