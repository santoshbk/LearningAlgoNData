package santosh.algorithms.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kumbar on 5/18/2016.
 */
public class TwoStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();
		while (t-- > 0) {
			String a = in.nextLine();
			String b = in.nextLine();
			find(a, b);
		}
	}

	private static void find(String a, String b) {
		char[] aa = a.toCharArray();
		Arrays.sort(aa);
		char[] bb = b.toCharArray();
		Arrays.sort(bb);
		boolean flag = false;
		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < bb.length; j++) {
				if (aa[i] == bb[j]) {
					flag = true;
					break;
				}

			}
			if (flag)
				break;
		}
		if (flag) {
			System.out.println("YES");
		} else
			System.out.println("NO");
	}
	
	private static boolean findA(String a, String b){
		char[] aa = a.toCharArray();
		for (int i = 0; i < aa.length; i++) {
			if(b.contains(aa[i]+"")){
				return true;
			}
		}
		return false;
	}

}
