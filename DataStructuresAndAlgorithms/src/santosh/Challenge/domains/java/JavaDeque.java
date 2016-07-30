package santosh.Challenge.domains.java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class JavaDeque {

    public static void main(final String[] args) {
	final Scanner in = new Scanner(System.in);
	final Deque<Integer> deque = new ArrayDeque<>();
	final int n = in.nextInt();
	final int m = in.nextInt();
	int max = 0;
	final Map<Integer, Integer> map = new HashMap<>();
	for (int i = 0; i < n; i++) {
	    final int num = in.nextInt();
	    deque.add(num);
	    if (map.containsKey(num)) {
		map.put(num, map.get(num) + 1);
	    } else {
		map.put(num, 1);
	    }
	    if (deque.size() == (m + 1)) {
		final int k = deque.remove();
		if (map.get(k) > 1) {
		    map.put(k, map.remove(k) - 1);
		} else {
		    map.remove(k);
		}
	    }
	    if (deque.size() == m) {
		max = max > map.size() ? max : map.size();
	    }
	}
	in.close();
	System.out.println(max);
    }

    private static void checkLength(final Deque<Integer> deque, final int m) {
	final ArrayDeque<Integer> dq = new ArrayDeque<>();
	int unique = 0;
	int i = 0;
	final Set<Integer> set = new HashSet<>(m, 1);
	for (final Integer integer : deque) {
	    i++;
	    dq.add(integer);
	    if (i >= m) {
		set.addAll(dq);
		final int size = set.size();
		if (unique < size) {
		    unique = size;
		}
		dq.remove();
		set.clear();
	    }
	}
	System.out.println(unique);
    }

}
