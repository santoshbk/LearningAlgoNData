package santosh.algorithms.primefactorization;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		List<Integer> list = factors(N);
		System.out.println(list);
		int X = 1;
		for (Integer integer : list) {
			X*=integer;
		}
		System.out.println(X);
		System.out.println(N==X);

	}

	static List<Integer> factors(int N) {
		List<Integer> list = new ArrayList<>();
		if (N == 0) {
			list.add(0);
			return list;
		}
		if (N == 1) {
			list.add(1);
			return list;
		}
		if (N == 2) {
			list.add(2);
			return list;
		}
		double stop=Math.sqrt(N);
		while (N % 2 == 0) {
			N/=2;
			list.add(2);
		}
		int factor = 3;
		while(factor<=stop){
			while(N%factor==0){
				list.add(factor);
				N/=factor;
			}
			factor+=2;
		}
		if(N>1) list.add(N);
		return list;

	}

}
