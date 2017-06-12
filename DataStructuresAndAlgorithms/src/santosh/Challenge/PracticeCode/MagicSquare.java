package santosh.Challenge.PracticeCode;

import java.util.Scanner;

public class MagicSquare {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n % 2 == 0) {
			System.out.println("enter odd number!");
			System.exit(0);
		}
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = -1;
			}
		}
		int k = in.nextInt();
		int ib = 0;
		int jb = n / 2;
		int oi = ib;
		int oj = jb;
		for (int i = 0; i < n * n; i++) {
			int val = arr[ib][jb];
			if (val != -1) {
				oi = inc(oi, n);
				arr[oi][oj] = k++;
				ib = oi;
				jb = oj;
			} else {
				arr[ib][jb] = k++;
				oi = ib;
				oj = jb;
			}
			ib = dec(ib, n);
			jb = inc(jb, n);
		}
		display(arr);
	}

	private static int dec1(int i, int n) {
		return i == n - 1 ? 0 : i + 1;
	}

	private static int inc(int jb, int n) {
		return jb == n - 1 ? 0 : jb + 1;
	}

	private static int dec(int ib, int n) {
		return ib == 0 ? n - 1 : ib - 1;
	}

	private static void display(int[][] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
