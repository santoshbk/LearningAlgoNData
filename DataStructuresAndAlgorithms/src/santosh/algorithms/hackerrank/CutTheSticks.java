package santosh.algorithms.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		stick(arr);
		in.close();
	}

	static void stick(int[] a) {
		Arrays.sort(a);
		int count = a.length;
		int small = a[0];
		boolean flag = false;
		System.out.println(count);
		while (count > 0) {
			if (flag) {
				System.out.println(count);
				flag = false;
			}
			for (int i = 0; i < a.length;) {
				if(a[i]<small){
					small = a[i];
				}
				if (a[i] <= small) {
					a = Arrays.copyOfRange(a, i + 1, a.length);
					count--;
					flag = true;
				} else {
					a[i] = a[i] - small;
					i++;
				}
			}
		}
	}

	static void cut(int[] a) {
		Arrays.sort(a);
		int small = a[0];
		int count = a.length;

		while (count > 0) {
			System.out.println(count);
			for (int i = 0; i < a.length; i++) {
				if (a[i] == -1) {
					continue;
				}
				if (0 <= a[i] && a[i] <= small) {
					a[i] = -1;
					count--;
				} else {
					a[i] = a[i] - small;
				}
			}
		}

	}

	static int findSmallest(int[] a) {
		int s = a[0];
		for (int i = 1; i < a.length; i++) {
			if (s > a[i]) {
				s = a[i];
			}
		}
		return s;
	}

}
