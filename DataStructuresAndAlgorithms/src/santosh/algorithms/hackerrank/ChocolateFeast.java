package santosh.algorithms.hackerrank;

import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();
			System.out.println(calculate(n / c, m));
		}
		in.close();
	}

	private static int calculate(int res, int m) {
		if (res < m) {
			return res;
		} else if (res == m) {
			return res + 1;
		} else {
			int choc = res;
			int wrap = res;
			while (wrap >= m) {
				int rem = wrap % m;
				int div = wrap / m;
				wrap = div + rem;
				choc += div;
			}
			return choc;
		}
	}

}
