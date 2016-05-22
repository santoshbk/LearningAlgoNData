package santosh.algorithms.hackerrank.strings;

import java.util.Scanner;

public class MakeItAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		sc.close();
		System.out.println(newSolution(s1.toCharArray(), s2.toCharArray()));
	}

	private static int newSolution(char[] s1, char[] s2) {
		int[] a1 = countArr(s1);
		int[] a2 = countArr(s2);
		int count = 0;
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] != a2[i]) {
				count += Math.abs((a1[i] - a2[i]));
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
