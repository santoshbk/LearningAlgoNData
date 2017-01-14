package hackerrank.ds.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {
    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	List<List<Integer>> list = new ArrayList<>();
	for (int i = 0; i < n; i++) {
	    list.add(new ArrayList<>());
	}
	int k = in.nextInt();
	int lastAns = 0;
	for (int i = 0; i < k; i++) {
	    int type = in.nextInt();
	    int x = in.nextInt();
	    int y = in.nextInt();
	    int seq = (x ^ lastAns) % n;
	    List<Integer> subSeq = list.get(seq);
	    if (type == 1) {
		subSeq.add(y);
	    } else {
		lastAns = subSeq.get(y % subSeq.size());
		System.out.println(lastAns);
	    }
	}
    }
}
