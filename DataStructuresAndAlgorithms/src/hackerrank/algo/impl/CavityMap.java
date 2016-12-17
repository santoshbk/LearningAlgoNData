package hackerrank.algo.impl;

import java.util.Scanner;

public class CavityMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String grid[] = new String[n];
		for (int grid_i = 0; grid_i < n; grid_i++) {
			grid[grid_i] = in.next();
		}
		in.close();
		solution(getCharArr(grid, n), n);
	}

	private static void solution(char[][] a, int n) {

		for (int i = 0; i < n; i++) {

			if (i == 0 || i == n - 1) {
				continue;
			}
			for (int j = 0; j < n; j++) {
				boolean flag = false;
				if (j == 0 || j == n - 1) {
					continue;
				}
				/*
				 * char arr[] = { a[i - 1][j - 1], a[i - 1][j], a[i - 1][j + 1],
				 * a[i][j - 1], a[i][j + 1], a[i + 1][j - 1], a[i + 1][j], a[i +
				 * 1][j + 1] };
				 */
				char arr[] = { a[i - 1][j], a[i][j - 1], a[i + 1][j], a[i][j + 1] };
				for (int k = 0; k < 4; k++) {
					if (a[i][j] <= arr[k]) {
						flag = true;
						break;
					}
				}
				if (flag) {
					continue;
				} else {
					a[i][j] = 'X';
				}
			}
		}

		display(a, n);
	}

	private static void display(char[][] a, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

	static private char[][] getCharArr(String[] a, int n) {
		char[][] c = new char[n][n];
		for (int i = 0; i < n; i++) {
			char[] d = a[i].toCharArray();
			for (int j = 0; j < n; j++) {
				c[i][j] = d[j];
			}
		}
		return c;
	}

}
