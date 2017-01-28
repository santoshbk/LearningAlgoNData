package hackerearth.challenges.JanCir17;

import java.util.Scanner;

public class MicrosHouse {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			int x = arr[i][0];
			for (int j = 1; j < m - 1; j++) {
				x ^= arr[i][j];
			}
			max = Math.max(max, x);
		}

	}
}
