package santosh.Challenge.PracticeCode;

import java.util.Scanner;

/**
 * Created by kumbar on 5/6/2016.
 */
public class Anagram {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			String s = sc.nextLine();
			int len = s.length();
			if(len%2==1){
				System.out.println(-1);
				continue;
			}
			int index = (len/2);
			String s1 = s.substring(0, index);
			String s2 = s.substring(index+1, len-1);
			System.out.println(s1);
			System.out.println(s2);
		}
		
		sc.close();
	}
    
}
