package hackerrank.algo.impl;

import java.util.Scanner;

public class Encryption {
    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	String s = in.next();
	in.close();
	int len = s.length();
	int floor = (int) Math.floor(Math.sqrt(len));
	int ceil = (int) Math.ceil(Math.sqrt(len));
	System.out.println(len);
	System.out.println(ceil);
	System.out.println(floor);
	int r = floor;
	int c = ceil;
	if ((r * c) < len) {
	    r = c = ceil;
	}
	char[][] arr = new char[r][c];
	char[] cc = s.toCharArray();
	for (int i = 0, k = 0; i < r; i++) {
	    for (int j = 0; j < c; j++) {
		if (k >= len) {
		    arr[i][j] = ' ';
		} else {
		    arr[i][j] = cc[k++];
		}
	    }
	}
	display(arr, r, c);
    }

    static void displayNormal(final char[][] arr, final int r, final int c) {
	for (int i = 0; i < r; i++) {
	    for (int j = 0; j < c; j++) {
		if (arr[i][j] == ' ') {
		    continue;
		}
		System.out.print(arr[i][j]);
	    }
	    System.out.println();
	}
    }

    private static void display(final char[][] arr, final int r, final int c) {
	for (int j = 0; j < c; j++) {
	    for (int i = 0; i < r; i++) {
		System.out.print(arr[i][j]);
	    }
	    System.out.print(" ");
	}
    }

}
