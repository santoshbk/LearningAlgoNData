package santosh.Challenge.domains.java;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			for (int j = 1; j <= n; j++) {
				System.out.print(calculateNth(a, b, j));
				System.out.print(" ");
			}
			System.out.println();
		}
		in.close();
	}
	
	static int calculateNth(int a, int b, int j){
		int res = a;
		for (int i = 0; i < j; i++) {
			res += (Math.pow(2,i)*b);
		}
		return res;
	}
}
