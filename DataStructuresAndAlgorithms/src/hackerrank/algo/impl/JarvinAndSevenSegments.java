package hackerrank.algo.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JarvinAndSevenSegments {

    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	while (t-- > 0) {
	    int l = in.nextInt();
	    int[] a = new int[l];
	    System.out.println(printSolution(a, l));
	}
    }

    static Map<Integer, Integer> map = new HashMap<>();
    static {
	map.put(1, 2);
	map.put(2, 5);
	map.put(3, 5);
	map.put(4, 4);
	map.put(5, 5);
	map.put(6, 6);
	map.put(7, 3);
	map.put(8, 7);
	map.put(9, 6);
	map.put(0, 6);
    }

    private static int getVal(final int t) {
	;
	return map.get(t);
    }

    private static int printSolution(final int[] a, final int l) {
	int min = 0;
	int minNum = 0;
	return 0;
    }

}
