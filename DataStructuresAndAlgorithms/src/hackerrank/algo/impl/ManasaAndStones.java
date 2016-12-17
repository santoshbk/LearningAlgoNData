package hackerrank.algo.impl;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ManasaAndStones {

	static Set<Integer> s = new TreeSet<>();
	static List<Integer> ll = new LinkedList<>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();

			// solution(n, a, b);
			// solQ(n, a, b);
			solArr(n, a, b);
		}
		in.close();
	}

	private static void solQ(int n, int a, int b) {
		if (a == b) {
			System.out.println(n - a);
			return;
		}
		Queue<Integer> q = new ArrayDeque<>();
		q.add(0);
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		for (int i = 0; i < n - 1; i++) {
			int k = q.size();
			for (int j = 0; j < k; j++) {
				int x = q.poll();
				q.add(x + min);
				q.add(x + max);
			}
		}
		Set<Integer> set = new TreeSet<>();
		for (int i = 1; !q.isEmpty(); i++) {
			set.add(q.poll());
		}
		for (Integer i : set) {
			System.out.print(i + " ");
		}
	}

	private static void solArr(int n, int a, int b) {
		if (a == b) {
			System.out.println(n - a);
			return;
		}
		Set<Integer> set = new TreeSet<>();
		set.add(0);
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		for (int i = 0; i < n - 1; i++) {
			Set<Integer> ss = new HashSet<>();
			for (Integer z : set) {
				ss.add(min + z);
				ss.add(max + z);
			}
			if (i == 990) {
				System.out.print("");
			}
			set.clear();
			set.addAll(ss);
		}
		for (Integer integer : set) {
			System.out.print(integer+"\t");
		}
		System.out.println();
	}

	private static void solution(int n, int a, int b) {
		if (a == b) {
			System.out.println(n - a);
			return;
		}
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		s.clear();
		List<Integer> list = new LinkedList<>();
		list.add(0);
		for (int i = 0; i < n - 1; i++) {
			list = getD(list, a, b);
			ll.clear();
		}
		s.addAll(list);
		for (Integer i : s) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static List<Integer> getD(List<Integer> list, int a, int b) {
		for (Integer k : list) {
			ll.add(a + k);
			ll.add(b + k);
		}
		return ll;
	}

}
