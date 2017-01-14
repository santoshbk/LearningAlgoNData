package hackerrank.ds.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {
    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	in.nextLine();
	Map<String, Integer> map = new HashMap<>();
	for (int i = 0; i < n; i++) {
	    String s = in.nextLine();
	    if (map.containsKey(s)) {
		map.put(s, map.get(s) + 1);
	    } else {
		map.put(s, 1);
	    }
	}
	int k = in.nextInt();
	in.nextLine();
	for (int i = 0; i < k; i++) {
	    String s = in.nextLine();
	    if (map.containsKey(s)) {
		System.out.println(map.get(s));
	    } else {
		System.out.println(0);
	    }
	}
    }
}
