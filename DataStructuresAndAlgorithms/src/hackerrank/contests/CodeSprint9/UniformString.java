package hackerrank.contests.CodeSprint9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniformString {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		Integer n = in.nextInt();
		char x = s.charAt(0);
		List<Integer> sList = new ArrayList<>();
		Integer val = x - 96;
		sList.add(val);
		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if (x == c) {
				val += c - 96;
				sList.add(val);
			} else {
				x = c;
				val = c - 96;
				sList.add(val);
			}
		}
		for (int i = 0; i < n; i++) {
			Integer f = in.nextInt();
			if (sList.contains(f)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
