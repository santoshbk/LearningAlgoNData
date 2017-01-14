package hackerrank.ds.arrays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LeftRotation {
    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int k = in.nextInt();
	Queue<Integer> q = new LinkedList<>();
	for (int i = 0; i < n; i++) {
	    q.offer(in.nextInt());
	}
	for (int i = 0; i < k; i++) {
	    q.offer(q.remove());
	}
	q.forEach(i -> System.out.print(i + " "));
    }
}
