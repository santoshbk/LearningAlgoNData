package hackerrank.java.intro;

import java.util.Scanner;

public class ExceprionTryCatch {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			int xx = Integer.parseInt(s.nextLine());
			int yy = Integer.parseInt(s.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("java.util.InputMismatchException");
		} catch (ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
	}

}
