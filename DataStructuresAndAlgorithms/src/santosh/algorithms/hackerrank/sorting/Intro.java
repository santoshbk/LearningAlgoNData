package santosh.algorithms.hackerrank.sorting;

import java.util.Scanner;

public class Intro {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int v = in.nextInt();
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if(v==a[i]){
				System.out.println(i);
				break;
			}
		}
	}

}
