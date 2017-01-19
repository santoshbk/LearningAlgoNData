package hackerrank.tutorials.days30;

import java.util.Scanner;

public class MoreException {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			int n = in.nextInt();
			int p = in.nextInt();
			Calculator c = new Calculator();
			try {
				int ans = c.power(n, p);
				System.out.println(ans); 
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
	}

}

class Calculator {
	int power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		}
		
		return (int) Math.pow(n, p);
	}
}
