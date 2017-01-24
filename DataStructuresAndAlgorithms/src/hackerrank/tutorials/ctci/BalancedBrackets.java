package hackerrank.tutorials.ctci;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static boolean isBalanced(final String expression) {
		Map<Character, Character> m = new HashMap<>();
		List<Character> list = Arrays.asList('{', '(', '[');
		m.put('(', ')');
		m.put('{', '}');
		m.put('[', ']');
		m.put(')', '(');
		m.put('}', '{');
		m.put(']', '[');
		int l = expression.length();
		if (!list.contains(expression.charAt(0)) || l % 2 != 0 || list.contains(expression.charAt(l - 1))) {
			return false;
		}
		Stack<Character> stack = new Stack<>();
		stack.push(expression.charAt(0));
		for (int i = 1; i < l; i++) {
			char sc = expression.charAt(i);
			if (!list.contains(sc)) {
				if (stack.isEmpty()) {
					return false;
				}
				char c = stack.pop();
				if (expression.charAt(i) != m.get(c)) {
					return false;
				}
			} else {
				stack.push(sc);
			}
		}
		return true;
	}

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		in.nextLine();
		while (t-- > 0) {
			String s = in.next();
			System.out.println((isBalanced(s)) ? "YES" : "NO");
		}
	}
}
