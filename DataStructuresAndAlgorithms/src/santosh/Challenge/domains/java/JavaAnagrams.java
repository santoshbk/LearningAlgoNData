package santosh.Challenge.domains.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kumbar on 5/7/2016.
 */
public class JavaAnagrams {
	static boolean isAnagram(String A, String B) {
		if (A.length() != B.length()) {
			return false;
		}
		char[] ca = A.toLowerCase().toCharArray();
		char[] cb = B.toLowerCase().toCharArray();
		Arrays.sort(ca);
		Arrays.sort(cb);
		for (int i = 0; i < cb.length; i++) {
			if (ca[i] != cb[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		boolean ret = isAnagram(A, B);
		if (ret)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");

	}
}
