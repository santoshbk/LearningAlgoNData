package hackerrank.algo.strings;

import java.util.Scanner;

public class LoveLetterMystery {

    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	in.nextLine();
	while (t-- > 0) {
	    String s = in.nextLine();
	    System.out.println(makePalindrome(s));
	}
	in.close();
    }

    private static int makePalindrome(final String s) {
	char[] c = s.toCharArray();
	int len = c.length;
	int count = 0;
	for (int i = 0, j = len - 1; i < (len / 2); i++, j--) {
	    char a = c[i];
	    char b = c[j];
	    if (a != b) {
		while (a != b) {
		    if (a < b) {
			if (b != 'a') {
			    b = (char) (b - 1);
			    count++;
			} else {
			    a = (char) (a - 1);
			    count++;
			}
		    } else {
			if (a != 'a') {
			    a = (char) (a - 1);
			    count++;
			} else {
			    b = (char) (b - 1);
			    count++;
			}
		    }

		}
	    }
	}
	return count;
    }

}
