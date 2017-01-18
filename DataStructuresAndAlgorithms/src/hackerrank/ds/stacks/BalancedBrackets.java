package hackerrank.ds.stacks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		Map<Character, Character> m = new HashMap<>();
		List<Character> list = Arrays.asList('{', '(', '[');
		m.put('(', ')');
		m.put('{', '}');
		m.put('[', ']');
		m.put(')', '(');
		m.put('}', '{');
		m.put(']', '[');
		int t = in.nextInt();
		in.nextLine();
		while (t-- > 0) {
			String s = in.nextLine();
			int l = s.length();
			boolean flag = false;
			if (!list.contains(s.charAt(0)) || l % 2 != 0) {
				System.out.println("NO");
				continue;
			}
			Stack<Character> stack = new Stack<>();
			stack.push(s.charAt(0));
			for (int i = 1; i < l; i++) {
				char sc = s.charAt(i);
				if (!list.contains(sc)) {
					if (stack.isEmpty()) {
						flag = true;
						break;
					}
					char c = stack.pop();
					if (s.charAt(i) != m.get(c)) {
						flag = true;
						break;
					}
				} else {
					stack.push(sc);
				}
			}

			if (!flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
