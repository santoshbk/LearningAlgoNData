package hackerrank.algo.warmup;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class CircularArrayRotation {
    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int k = in.nextInt();
	int q = in.nextInt();
	Deque<Integer> dq = new LinkedList<>();
	for (int i = 0; i < n; i++) {
	    dq.addLast(in.nextInt());
	}
	k %= n;
	for (int i = 0; i < k; i++) {
	    dq.push(dq.removeLast());
	}

	int[] arr = new int[n];
	int i = 0;
	while (!dq.isEmpty()) {
	    arr[i++] = dq.remove();
	}
	for (int j = 0; j < q; j++) {
	    System.out.println(arr[in.nextInt()]);
	}
	in.close();
    }
}
