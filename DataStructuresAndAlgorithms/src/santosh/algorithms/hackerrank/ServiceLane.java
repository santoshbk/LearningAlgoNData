package santosh.algorithms.hackerrank;

import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int width[] = new int[n];
		for (int width_i = 0; width_i < n; width_i++) {
			width[width_i] = in.nextInt();
		}
		for (int a0 = 0; a0 < t; a0++) {
			int i = in.nextInt();
			int j = in.nextInt();
			System.out.println(solution(width, i, j));
		}
	}
	
	private static int solution(int[] width, int i, int j){
		int min = width[i];
		for (int k = i+1; k <= j; k++) {
			if(width[k]<min){
				min = width[k];
			}
		}
		return min;
	}

}
