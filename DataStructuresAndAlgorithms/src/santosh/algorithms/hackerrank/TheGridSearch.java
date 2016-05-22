package santosh.algorithms.hackerrank;

import java.util.Scanner;

public class TheGridSearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			int C = in.nextInt();
			String G[] = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String P[] = new String[r];
			for (int P_i = 0; P_i < r; P_i++) {
				P[P_i] = in.next();
			}
			char[][] big = prepareArray(G, R, C);
			char[][] small = prepareArray(P, r, c);
			int x = small[0][0];
			boolean flag = false;
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					if (big[i][j] == x) {
						if ((i + r) <= R && (j + c) <= C) {
							boolean z = false;
							for (int j2 = 0; j2 < r; j2++) {
								for (int k = 0; k < c; k++) {
									if(i==996){
										System.out.println(small[j2][k]+" "+big[i + j2][j + k]);
									}
									if (small[j2][k] != big[i + j2][j + k]) {
										z = true;
										break;
									}
								}
								if (z)
									break;
							}
							if (!z)
								flag = true;
						}
					}
				}
			}
			if (flag)
				System.out.println("YES");
			else
				System.out.println("NO");

		}

	}

	private static char[][] prepareArray(String[] arr, int r, int c) {
		char[][] a = new char[r][c];
		for (int i = 0; i < arr.length; i++) {
			char[] s = arr[i].toCharArray();
			for (int j = 0; j < s.length; j++) {
				a[i][j] = s[j];
			}
		}
		return a;
	}

}
