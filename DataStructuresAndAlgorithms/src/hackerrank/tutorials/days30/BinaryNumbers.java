package hackerrank.tutorials.days30;

import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		count(n);
		in.close();
	}

	private static void count(int n) {
		String b = Integer.toBinaryString(n);
		char[] c = b.toCharArray();
		int countMax = 0;
		int count = 0;
		int len = c.length;
		for (int i = 0; i < len; i++) {
			if (c[i] == '1') {
				count++;
			} else {
				if (countMax < count) {
					countMax = count;
				}
				count = 0;
			}
			if(i == len-1 && countMax < count){
				countMax = count;
			}
		}
		System.out.println(countMax);
	}

}
