package hackerrank.algo.impl;

import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			long a = in.nextLong();
			long b = in.nextLong();
			solution(a, b);
		}
		in.close();
	}

	private static void solution(long a, long b) {
		int start = (int) Math.ceil(Math.sqrt(a));
		int end = (int) Math.floor(Math.sqrt(b));
		int count = 0;
		for (int i = start; i <= end; i++) {
			count++;
		}
		System.out.println(count);
	}

}
