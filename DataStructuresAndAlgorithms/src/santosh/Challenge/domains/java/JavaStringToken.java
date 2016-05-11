package santosh.Challenge.domains.java;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by kumbar on 5/7/2016.
 */
public class JavaStringToken {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		//printTokens(s);
		System.out.println("-------------");
		printTokenizers(s);
	}
	static void printTokenizers(String s){
		StringTokenizer t = new StringTokenizer(s, "[ .!',?\\><@#$%^&*()_-+=|/]");
		System.out.println(t.countTokens());
		while(t.hasMoreTokens()){
			System.out.println(t.nextToken());
		}
	}
	static void printTokens(String s){
		String[] a = s.split("[A-Za-z]-");
		System.out.println(a.length);
		for (String string : a) {
			System.out.println(string);
		}
	}

}
