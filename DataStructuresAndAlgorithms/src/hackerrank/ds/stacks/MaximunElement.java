package hackerrank.ds.stacks;

import java.util.Scanner;
import java.util.Stack;

public class MaximunElement {

    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	Stack<Integer> s = new Stack<>();
	for (int i = 0; i < n; i++) {
	    int type = in.nextInt();
	    if (type == 1) {
		int x = in.nextInt();
		if (s.isEmpty()) {
		    s.push(x);
		} else {
		    s.push(Math.max(x, s.peek()));
		}
	    } else if (type == 2) {
		s.pop();
	    } else {
		System.out.println(s.peek());
	    }
	}
    }

}
