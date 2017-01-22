package hackerrank.tutorials.ctci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakingAnagrams {

	public static int numberNeeded(final String first, final String second) {
		int num = 0;
		int fl = first.length();
		int sl = second.length();
		List<Character> f = new ArrayList<>();
		List<Character> s = new ArrayList<>();
		for (char c : first.toCharArray()) {
			f.add(c);
		}
		for (char c : second.toCharArray()) {
			s.add(c);
		}
		for (Character c : first.toCharArray()) {
			if (!s.remove(c)) {
				num++;
			}
		}
		for (Character c : second.toCharArray()) {
			if (!f.remove(c)) {
				num++;
			}
		}
		return num;
	}

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}

}
