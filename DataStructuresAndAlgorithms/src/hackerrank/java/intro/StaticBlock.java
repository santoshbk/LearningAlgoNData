package hackerrank.java.intro;

import java.lang.reflect.Method;
import java.util.Scanner;

public class StaticBlock {

	static boolean flag;
	static int B, H;

	static {
		Scanner scan = new Scanner(System.in);
		B = scan.nextInt();
		H = scan.nextInt();
		flag = false;
		try {
			test(B, H);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	static void test(int B, int H) throws Exception {
		if (B < 0 || H < 0)
			throw new Exception("Breadth and height must be positive");
		else flag = true;
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.println(area);
		}
		
	}

}
