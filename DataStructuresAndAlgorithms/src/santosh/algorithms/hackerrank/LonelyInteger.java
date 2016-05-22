package santosh.algorithms.hackerrank;

import java.util.Scanner;

public class LonelyInteger {

	static int lonelyinteger(int[] a) {
		int[] f = new int[100];
		for (int i = 0; i < a.length; i++) {
			f[a[i]] = f[a[i]]^1;
		}
		for (int i = 0; i < f.length; i++) {
			if(f[i]==1){
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;

		int size = Integer.parseInt(in.nextLine());
		int[] _a = new int[size];
		int _a_item;
		String next = in.nextLine();
		String[] next_split = next.split(" ");

		for (int _a_i = 0; _a_i < size; _a_i++) {
			_a_item = Integer.parseInt(next_split[_a_i]);
			_a[_a_i] = _a_item;
		}

		res = lonelyinteger(_a);
		System.out.println(res);

	}

}
