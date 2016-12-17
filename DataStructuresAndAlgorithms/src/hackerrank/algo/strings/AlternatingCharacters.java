package hackerrank.algo.strings;

import java.util.Arrays;
import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String s = in.nextLine();
			System.out.println(countDeletion(s));
		}
	}

	private static int countDeletion(String s) {
		int count = 0;
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length-1;) {
			if (c.length == 1) {
				break;
			}
			if (check(c[i], c[i + 1])) {
				count++;
				if (i >= c.length)
					break;
				//c = Arrays.copyOfRange(c, i + 1, c.length);
				i=i+1;
				continue;
			} else {
				i++;
			}

		}
		return count;
	}

	private static boolean check(char a, char b) {
		if (a == b) {
			return true;
		}
		return false;
	}

}
