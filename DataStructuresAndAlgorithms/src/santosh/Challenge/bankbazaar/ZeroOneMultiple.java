package santosh.Challenge.bankbazaar;

import java.util.Scanner;

public class ZeroOneMultiple {

	static String Zero_One(int num) {
		long n = 0;
		long n1 = num;
		for (int i = 1;; i++) {
			n = n1 * i;
			System.out.println(n);
			String s = String.valueOf(n);
			boolean flag = false;
			for (char c : s.toCharArray()) {
				if (c == '1' || c == '0') {
					
				} else{
					flag = true;
					break;
				}
			}
			if (flag) continue;
				return s;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input N");
		System.out.println(Integer.MAX_VALUE);
		int N = in.nextInt();
		System.out.println(Zero_One(N));
	}

}
