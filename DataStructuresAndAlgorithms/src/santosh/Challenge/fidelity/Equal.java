package santosh.Challenge.fidelity;

import java.util.Scanner;

public class Equal {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			if(N%2!=0){
				System.out.println("0");
				return;
			}
			int[] arr = new int[N];
			for (int j = 0; j < N; j++) {
				arr[j] = in.nextInt();
			}
			equal(arr);
		}
	}
	
	static void equal(int[] arr){
		int n = arr.length;
		int[] arr1 = new int[n/2];
		int[] arr2 = new int[n/2];
		for (int i = 0; i < n; i++) {
			
		}
	}

}
