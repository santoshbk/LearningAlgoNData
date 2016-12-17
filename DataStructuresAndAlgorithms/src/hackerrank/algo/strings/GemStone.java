package hackerrank.algo.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GemStone {

    public static void main(final String[] args) {

	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	in.nextLine();
	Map<Character, Integer> map = new HashMap<>(26, 1);
	boolean flag = true;
	for (int i = 0; i < t; i++) {
	    String s = in.nextLine().trim();
	    Set<Character> set = new HashSet<>();
	    for (int j = 0; j < s.length(); j++) {
		set.add(s.charAt(j));
	    }
	    for (Character c : set) {
		if (flag) {
		    if (!map.containsKey(c)) {
			map.put(c, 1);
		    }
		} else {
		    if (map.containsKey(c)) {
			map.put(c, map.get(c) + 1);
		    }
		}
	    }
	    flag = false;
	}
	in.close();
	int count = 0;
	for (char c : map.keySet()) {
	    if (map.get(c) == t) {
		count++;
	    }
	}
	System.out.println(count);

    }
}
