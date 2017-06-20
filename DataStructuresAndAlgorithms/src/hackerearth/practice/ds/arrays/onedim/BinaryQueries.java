package hackerearth.practice.ds.arrays.onedim;

import java.util.Scanner;

public class BinaryQueries {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < q; i++) {
			int k = in.nextInt();
			if (k == 1) {
				int x = in.nextInt();
				a[x - 1] = a[x - 1] ^ 1;
			} else {
				int l = in.nextInt();
				int r = in.nextInt();
				StringBuffer sb = new StringBuffer();
				for (int j = r - 1; j >= l; j--) {
					sb.append(a[j]);
				}
				int sum = Integer.parseInt(sb.toString(), 2);
				long sums = Long.parseLong(sb.toString(), 2);
				if (sums % 2 == 0) {
					System.out.println("EVEN");
				} else {
					System.out.println("ODD");
				}
			}
		}
	}
}
