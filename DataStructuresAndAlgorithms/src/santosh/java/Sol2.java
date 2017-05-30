package com;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sol2 {
	public static void main(final String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		// final String fileName = System.getenv("OUTPUT_PATH");
		// BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		// int res;
		String _skills;
		try {
			_skills = in.nextLine();
		} catch (Exception e) {
			_skills = null;
		}

		// res = differentTeams(_skills);
		// bw.write(String.valueOf(res));
		// bw.newLine();
		//
		// bw.close();
		System.out.println(differentTeams(_skills));
	}

	private static int differentTeams(final String _skills) {
		Map<Character, Integer> map = getMap();
		for (char c : _skills.toCharArray()) {
			map.put(c, map.get(c) + 1);
		}
		int min = Integer.MAX_VALUE;
		for (char c : map.keySet()) {
			int k = map.get(c);
			min = min < k ? min : k;
		}
		return min;
	}

	private static Map<Character, Integer> getMap() {
		Map<Character, Integer> map = new HashMap<>();
		map.put('p', 0);
		map.put('c', 0);
		map.put('m', 0);
		map.put('b', 0);
		map.put('z', 0);
		return map;
	}
}
