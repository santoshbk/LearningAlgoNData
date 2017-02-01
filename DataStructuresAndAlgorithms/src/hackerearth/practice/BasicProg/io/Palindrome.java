package hackerearth.practice.BasicProg.io;

import java.util.Scanner;

public class Palindrome {

	public static void main(final String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(isPalindrome(s) ? "YES" : "NO");
	}

	private static boolean isPalindrome(final String s) {
		int l = s.length();
		for (int i = 0, j = l - 1; i < l / 2; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
