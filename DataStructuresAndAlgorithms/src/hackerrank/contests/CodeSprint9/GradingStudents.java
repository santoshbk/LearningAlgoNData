package hackerrank.contests.CodeSprint9;

import java.util.Scanner;

public class GradingStudents {

	public static void main(final String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			int grade = in.nextInt();
			checkGrade(grade);
		}
	}

	private static void checkGrade(final int grade) {
		if (grade < 38) {
			System.out.println(grade);
		} else {
			int k = grade % 5;
			if (k == 0) {
				System.out.println(grade);
			} else {
				int j = grade + (5 - k);
				if (j - grade < 3) {
					System.out.println(j);
				} else {
					System.out.println(grade);
				}
			}
		}
	}

}
