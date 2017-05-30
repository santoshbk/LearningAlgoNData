package com;

import java.util.Scanner;

public class Duplication {

	static StringBuffer s;

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		buildString();
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			System.out.println(s.charAt(in.nextInt()));
		}
	}

	private static void buildString() {
		StringBuffer si = new StringBuffer("01");
		s = new StringBuffer(si);
		while (s.length() < 1000) {
			for (int i = 0; i < si.length(); i++) {
				s.append(invert(si.charAt(i)));
			}
			si = new StringBuffer(s);
		}
	}

	private static char invert(final char c) {
		if (c == '1') {
			return '0';
		} else {
			return '1';
		}
	}
}
