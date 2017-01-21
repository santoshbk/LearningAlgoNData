package hackerrank.java.intro;

import java.util.Scanner;

/**
 * Created by kumbar on 5/5/2016.
 */
public class StringSolution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		int lenA = A.length();
		int lenB = B.length();

		System.out.println(lenA + lenB);
		if (A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		System.out.print(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase()
				+ B.substring(1));

		/* Enter your code here. Print output to STDOUT. */
		sc.close();
	}

}
