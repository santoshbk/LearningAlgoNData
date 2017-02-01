package hackerearth.practice.BasicProg.io;

import java.util.Scanner;

public class ToggleString {
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		for (char c : line.toCharArray()) {
			if (c < 91) {
				System.out.print(String.valueOf(c).toLowerCase());
			} else {
				System.out.print(String.valueOf(c).toUpperCase());
			}
		}
		System.out.println();
	}

}
