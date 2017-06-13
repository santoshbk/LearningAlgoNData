package santosh.Challenge.PracticeCode;

import java.util.Scanner;

public class HawkeyeFloodfill {

	public static void main(final String[] args) {
		firstSol();
	}

	private static void secondSol() {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int i = s.nextInt();
		int j = s.nextInt();
		int p = s.nextInt();
		int[][] a = new int[N][N];
		int ki = p;
		// for (int k = 0; k < N; k++) {
		// for (int k2 = 0; k2 < N; k2++) {
		// a[k][k2] = -1;
		// }
		// }
		a[i][j] = p;
		int y = j;
		int x = i;
		for (int k = N / 2; k >= 0; k--) {
			int r = 3;
			for (int k2 = 0; k2 < 3; k2++) {
				for (int l = 0; l < r / 2; l++) {

				}
			}
		}

	}

	public static void firstSol() {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int i = s.nextInt();
		int j = s.nextInt();
		int p = s.nextInt();
		int[][] a = new int[N][N];
		int ki = p;
		for (int k = i; k > 0; k--) {
			int kj = ki;
			ki = dec(ki);
			for (int m = j; m > 0; m--) {
				a[k][m] = kj;
				kj = dec(kj);
			}
		}
		ki = p - 1;
		for (int k = i - 1; k > 0; k--) {
			int kj = ki;
			ki = dec(ki);
			for (int m = j + 1; m < N; m++) {
				a[k][m] = kj;
				kj = dec(kj);
			}
		}
		ki = p - 1;
		for (int k = i + 1; k < N; k++) {
			int kj = ki;
			ki = dec(ki);
			for (int m = j - 1; m > 0; m--) {
				a[k][m] = kj;
				kj = dec(kj);
			}
		}
		ki = p - 1;
		for (int k = i + 1; k < N; k++) {
			int kj = ki;
			ki = dec(ki);
			for (int m = j + 1; m < N; m++) {
				a[k][m] = kj;
				kj = dec(kj);
			}
		}
		print(a, N);
	}

	private static int dec(int k) {
		k -= 1;
		if (k <= 0) {
			return 0;
		}
		return k;
	}

	private static void print(final int[][] a, final int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
