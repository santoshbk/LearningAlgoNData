package santosh.algorithms.hackerrank;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		//one(n);
		stair(n);
		// three();
		/*
		 * String s; int a; s = "Foolish boy."; a = s.indexOf("Fool");
		 * System.out.println(a);
		 */}

	void t() {
		String s;
		int a;
		s = "Foolish boy.";
		a = s.indexOf("Fool");
		System.out.println(a);
	}

	static void stair(int n) {
		for (int j = 1, i=n-1; i >= 0; i--,j++) {
			String repeated = "";
			if(i==0){
				repeated = new String(new char[n]).replace("\0", "#");
				System.out.print(repeated);
				continue;
			}
			System.out.print(String.format("%" + i + "s", ""));
			repeated = new String(new char[j]).replace("\0", "#");
			System.out.print(repeated);
			System.out.println();
		}
	}

	static void one(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j) > n) {
					System.out.print("#");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	static void two() {
		int a = 1;
		int b = 2;
		int c = 3;
		a |= 4;
		b >>= 1;
		c <<= 1;
		a ^= c;
		System.out.println(a + " " + b + " " + c);
		System.out.println(32 >> 2);
	}

	static void three() {
		char a[] = new char[10];
		for (int i = 0; i < 10; ++i) {
			a[i] = '1';
			System.out.print(a[i] + "");
			i++;
		}
	}
}
