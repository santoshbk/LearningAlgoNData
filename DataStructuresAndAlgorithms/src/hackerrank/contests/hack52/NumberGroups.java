package hackerrank.contests.hack52;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberGroups {

	static List<Integer> list = new ArrayList<>();
	static int size = 0;

	static long sumOfGroup(final int k) {
		int j;
		if (size == 0) {
			j = 1;
		} else {
			j = list.get(size - 1);
		}
		for (int i = 0; i < k; i++) {
			list.add(j);
			size++;
			j += 2;
		}
		return 0;
	}

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int j;
		if (size == 0) {
			j = 1;
		} else {
			j = list.get(size - 1);
		}
		int id = getId(k);
		for (int i = 0; i < id; i++) {
			list.add(j);
			size++;
			j += 2;
		}
		System.out.println();
		for (int z : list) {
			System.out.print(z + " ");
		}
		System.out.println();
		long answer = sumOfGroup1(id);
		System.out.println(answer);
		in.close();
	}

	static long sumOfGroup1(final int k) {
		if (k == 1) {
			return 1;
		}
		int id = getId(k);
		int num = getStartingNum(id);
		long sum = 0;
		for (int i = 0; i < id; i++) {
			sum += num;
			num += 2;
		}
		return sum;
	}

	private static int getStartingNum(final int id) {
		int num = 1;
		for (int i = 1; i < id; i++) {
			num += 2;
		}
		return num;
	}

	private static int getId(final int k) {
		int id = 0;
		for (int i = 0, j = 1; i < k; i++) {
			id += j++;
		}
		return id;
	}
}
