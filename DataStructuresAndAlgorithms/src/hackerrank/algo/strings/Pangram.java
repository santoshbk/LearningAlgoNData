package hackerrank.algo.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by kumbar on 5/6/2016.
 */
public class Pangram {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.toLowerCase();
		s = s.replaceAll(" ", "");
		Set<Character> c = new HashSet<>();
		for (Character cc : s.toCharArray()) {
			c.add(cc);
		}
		int k = c.size();
		if(k == 26){
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}
		sc.close();
	}

}
