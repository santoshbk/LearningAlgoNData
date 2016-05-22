package santosh.algorithms.hackerrank;

import java.util.Scanner;

public class FlippingBits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			System.out.println(solution(in.nextLong()));
		}
		in.close();
	}

	private static long solution(long n) {
		String s = Long.toBinaryString(n);
		char[] c = s.toCharArray();
		int len = c.length;
		int[] is = new int[32];
		for (int i = 31, j = len-1; j >=0; i--, j--) {
			is[i] =  Integer.parseInt(c[j]+"");
		}
		flipBits(is);
		return Long.parseLong(getString(is), 2);
	}
	
	private static String getString(int[] a){
		StringBuilder sb = new StringBuilder(32);
		for (int i : a) {
			sb.append(i);
		}
		return sb.toString();
	}

	private static int[] flipBits(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] ^= 1;
		}
		return a;
	}

	private static void display(int[] a) {
		for (int i : a) {
			System.out.print(i + "");
		}
		System.out.println();
	}
}
