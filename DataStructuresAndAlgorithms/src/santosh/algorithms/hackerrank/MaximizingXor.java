package santosh.algorithms.hackerrank;

import java.util.Scanner;

public class MaximizingXor {

	static int maxXor(int l, int r) {
		int maxVal = -1;
		for (int i = l; i <= r; i++) {
			for (int j = i; j <= r; j++) {
				int res = i ^ j;
				if (res > maxVal) {
					maxVal = res;
				} 
			}
		}
		return maxVal;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;
		int _l;
		_l = Integer.parseInt(in.nextLine());

		int _r;
		_r = Integer.parseInt(in.nextLine());
		in.close();
		res = maxXor(_l, _r);
		System.out.println(res);

	}

}
