package santosh.Challenge.days30;

import java.util.Scanner;

public class Recursion {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(factorial(n));
		in.close();
	}
	
	static int factorial(int n){
		if(n<=1) return 1;
		return n*factorial(n-1);
	}
}
