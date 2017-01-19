package hackerrank.tutorials.days30;

import java.util.Scanner;

public class Arrays2D {

	public static void main(String[] args) {
		/*
		 * Scanner in = new Scanner(System.in); int arr[][] = new int[6][6]; for
		 * (int i = 0; i < 6; i++) { for (int j = 0; j < 6; j++) { arr[i][j] =
		 * in.nextInt(); } }
		 */
		int[][] arr = { { 1, 1, 1, 0, 0, 0 }, 
						{ 0, 1, 0, 0, 0, 0 }, 
						{ 1, 1, 1, 0, 0, 0 }, 
						{ 0, 0, 2, 4, 4, 0 },
						{ 0, 0, 0, 2, 0, 0 },
						{ 0, 0, 1, 2, 4, 0 } };
		print(arr);
	}

	private static void print(int[][] a) {
		int sumMax = Integer.MIN_VALUE;
		int sum = Integer.MIN_VALUE;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (j > 3 || i > 3) {
					continue;
				}
				sum = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1]
						+ a[i + 2][j + 2];
				System.out.println(a[i][j] + " " + a[i][j + 1] + " " + a[i][j + 2]);
				System.out.println("  "+a[i + 1][j + 1]+"  ");
				System.out.println(a[i + 2][j] + " " + a[i + 2][j + 1] + " " + a[i + 2][j + 2]);
				if (sumMax < sum) {
					sumMax = sum;
				}

			}
			if (i > 3) {
				continue;
			}
		}
		if(sumMax<sum){
			sumMax = sum;
		}
		System.out.println(sumMax);
	}

}
