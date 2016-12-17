package hackerrank.algo.impl;

import java.util.Scanner;

public class TheTimeInWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		print(h, m);
		in.close();
	}

	private static String[] ones = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
	private static String[] onePlus = { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "ninteen" };
	private static String[] tens = { "twenty", "thirty", "forty", "fifty" };
	private static String minutes = "minutes";

	private static void print(int h, int m) {
		if (m == 0) {
			String hour = getWord(h);
			System.out.println(hour + " o' clock");
		} else if (m < 30) {
			String hour = getWord(h);
			if (m == 1) {
				System.out.println("one minute past " + hour);
				return;
			}
			if (m == 15) {
				System.out.println("quarter past " + hour);
			} else {
				String min = getWord(m);
				System.out.println(min + " " + minutes + " past " + hour);
			}
		} else {
			if (m == 30) {
				String hour = getWord(h);
				System.out.println("half past " + hour);
			} else {
				String hour;
				if (h == 12) {
					hour = getWord(1);
				} else {
					hour = getWord(h + 1);
				}
				if (60 - m == 15) {
					System.out.println("quarter to " + hour);
				} else {
					String min = getWord(60 - m);
					System.out.println(min + " " + minutes + " to " + hour);
				}

			}
		}
	}

	private static String getWord(int n) {
		if (n <= 10) {
			return ones[n - 1];
		} else if (n < 20) {
			return onePlus[n - 11];
		} else {
			int i = n / 10;
			int j = n % 10;
			if (j == 0) {
				return tens[i - 1];
			} else {
				return tens[i - 2] + " " + ones[j - 1];
			}
		}
	}

}
