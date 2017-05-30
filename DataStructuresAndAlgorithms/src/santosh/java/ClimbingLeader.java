package com;

import java.util.Scanner;

public class ClimbingLeader {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] scores = new int[n];
		for (int i = 0; i < n; i++) {
			scores[i] = in.nextInt();
		}
		int m = in.nextInt();
		for (int i = 0; i < m; i++) {
			int k = in.nextInt();
			System.out.println(getRank(k, scores));
		}
	}

	private static int getRank(final int k, final int[] scores) {
		int len = scores.length;
		int[] arr = new int[len + 1];
		int x = 0;
		int rk = 0;
		boolean flag = true;
		for (int j = 0; j < len + 1; j++) {
			int i = scores[j];
			if (k < i) {
				arr[x++] = i;
			} else {
				if (flag) {
					arr[x++] = k;
					arr[x++] = i;
					flag = false;
				} else {
					arr[x++] = i;
				}
			}
			if (j == 0) {
				rk = 1;
			} else {
				if (arr[j - 1] > arr[j]) {
					rk++;
				}
			}
		}
		if (flag) {
			arr[x] = k;
			rk++;
		}

		int z = arr[len];
		if (z == k) {
			return rk;
		}
		for (int i = len - 1; i >= 0; i--) {
			int y = arr[i];
			if (z != y) {
				rk--;
				z = y;
			}
			if (y == k) {
				break;
			}
		}
		return rk;
	}
}
