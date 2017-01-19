package hackerrank.tutorials.days30;

import java.util.Scanner;

public class EcxceptionStringtoInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		solution(S);
		in.close();
	}

	private static void solution(String s) {
		try {
			int a = Integer.parseInt(s);
			System.out.println(a);
		} catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
	}

}
