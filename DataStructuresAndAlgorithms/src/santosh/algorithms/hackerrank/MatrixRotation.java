package santosh.algorithms.hackerrank;

import java.util.Scanner;

public class MatrixRotation {

	static int r;
	static int c;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		r = in.nextInt();
		c = in.nextInt();
		int k = in.nextInt();
		int[][] arr = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		in.close();

		int circle = calculateCircles();
		for (int i = 0; i < k; i++) {
			rotateOnce(arr, circle);
		}
		disply(arr);

	}

	private static void rotateOnce(int[][] a, int k) {
		for (int i = 0; i < k; i++) {
			rotate(a, i);
		}
	}

	private static void rotate(int[][] a, int z) {
		int i = z;
		int j = z;
		int temp = a[z][z];
		while (j < (c - z - 1)) {
			a[i][j] = a[i][j + 1];
			j++;
		}
		while (i < (r - z - 1)) {
			a[i][j] = a[i + 1][j];
			i++;
		}
		while (j > z) {
			a[i][j] = a[i][j - 1];
			j--;
		}

		while (i > z + 1) {
			a[i][j] = a[i - 1][j];
			i--;
		}
		a[i][j] = temp;
	}

	static int calculateCircles() {
		return Math.min(r, c) / 2;
	}

	private static void disply(int[][] arr) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
