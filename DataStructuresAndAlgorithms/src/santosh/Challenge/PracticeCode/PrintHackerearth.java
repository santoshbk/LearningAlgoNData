package santosh.Challenge.PracticeCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintHackerearth {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		String s = in.nextLine();
		Map<Character, Integer> map = getMap();
		for (char c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}
		}
		int minDouble = getMinDouble(map);
		int minSingle = getMinSingle(map);
		int x = minDouble < minSingle ? minDouble : minSingle;
		System.out.println(x);
	}

	private static int getMinSingle(final Map<Character, Integer> map) {
		int c = map.get('c');
		int k = map.get('k');
		int t = map.get('t');
		int min = c;
		min = k < min ? k : min;
		min = t < min ? t : min;
		return min;
	}

	private static int getMinDouble(final Map<Character, Integer> map) {
		int h = map.get('h') / 2;
		int a = map.get('a') / 2;
		int e = map.get('e') / 2;
		int r = map.get('r') / 2;
		int min = h;
		min = a < min ? a : min;
		min = e < min ? e : min;
		min = r < min ? r : min;
		return min;
	}

	private static Map<Character, Integer> getMap() {
		Map<Character, Integer> map = new HashMap<>();
		map.put('h', 0);
		map.put('a', 0);
		map.put('c', 0);
		map.put('k', 0);
		map.put('e', 0);
		map.put('r', 0);
		map.put('t', 0);
		return map;
	}
}
