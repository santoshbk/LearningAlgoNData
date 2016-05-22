package santosh.algorithms.hackerrank.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kumbar on 5/6/2016.
 */
public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			String s = sc.nextLine();
			int len = s.length();
			if (len % 2 == 1) {
				System.out.println(-1);
				continue;
			}
			int index = (len / 2);
			char[] s1 = s.substring(0, index).toCharArray();
			char[] s2 = s.substring(index, len).toCharArray();
			System.out.println(newSolution(s1, s2));
		}

		sc.close();
	}

	private static int solution(char[] s1, char[] s2) {
		Arrays.sort(s1);
		Arrays.sort(s2);
		int count = 0;
		for (int i = 0; i < s2.length; i++) {
			if (s1[i] != s2[i]) {
				count++;
			}
		}
		return count;
	}

	private static int newSolution(char[] s1, char[] s2) {
		int[] a1 = countArr(s1);
		int[] a2 = countArr(s2);
		int count = 0;
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] > a2[i]) {
				count += (a1[i] - a2[i]);
			}
		}
		return count;
	}

	private static int[] countArr(char[] s) {
		int[] a = new int[26];
		for (int i = 0; i < s.length; i++) {
			int x = s[i] - 97;
			a[x] += 1;
		}
		return a;
	}

}
