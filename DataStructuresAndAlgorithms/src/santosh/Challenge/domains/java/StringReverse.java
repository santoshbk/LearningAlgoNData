package santosh.Challenge.domains.java;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by kumbar on 5/5/2016.
 */
public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		//usingStack(A);
		looping(A);
	}

	static void usingStack(String s) {
		
		Stack<Character> c = new Stack<>();
	}
	
	static void looping(String s){
		char[] c = s.toCharArray();
		int len = c.length;
		for (int i = 0, j=len-1; i<=j; i++, j--) {
			if(c[i]!=c[j]){
				System.out.println("No");
				return;
			} 
		}
		System.out.println("Yes");

	}

}
