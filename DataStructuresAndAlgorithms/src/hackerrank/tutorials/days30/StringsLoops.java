package hackerrank.tutorials.days30;

import java.util.Scanner;

/**
 * Created by kumbar on 5/7/2016.
 */
public class StringsLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			String s = sc.nextLine();
			s = s.trim();
			String s1 = "";
			String s2 = "";
			char[] c = s.toCharArray();
			for (int j = 0; j < c.length; j++) {
				if(j%2==0){
					s1 = s1+c[j];
				} else {
					s2 = s2+c[j];
				}
			}
			System.out.println(s1+" "+s2);
		}
	}

}
