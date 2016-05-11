package santosh.Challenge.domains.java;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by kumbar on 5/7/2016.
 */
public class JavaStack {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			Stack<Character> c = new Stack<>();
			char[] cc = input.toCharArray();
			if (cc.length % 2 == 1) {
				System.out.println(false);
				continue;
			}
			for (int i = 0; i < cc.length; i++) {
				if (c.isEmpty()) {
					c.push(cc[i]);
				} else {
					if (c.peek() == cc[i]) {
						c.pop();
					} else {
						c.push(cc[i]);
					}
				}
			}
			System.out.println(c.isEmpty());
		}

	}

}
