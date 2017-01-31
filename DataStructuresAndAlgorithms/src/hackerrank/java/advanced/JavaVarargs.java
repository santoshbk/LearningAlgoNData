package hackerrank.java.advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class JavaVarargs {
	public static void main(final String[] args) {
		try {
			final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			final int n1 = Integer.parseInt(br.readLine());
			final int n2 = Integer.parseInt(br.readLine());
			final int n3 = Integer.parseInt(br.readLine());
			final int n4 = Integer.parseInt(br.readLine());
			final int n5 = Integer.parseInt(br.readLine());
			final int n6 = Integer.parseInt(br.readLine());
			final Add ob = new Add();
			ob.add(n1, n2);
			ob.add(n1, n2, n3);
			ob.add(n1, n2, n3, n4, n5);
			ob.add(n1, n2, n3, n4, n5, n6);
			final Method[] methods = Add.class.getDeclaredMethods();
			final Set<String> set = new HashSet<>();
			boolean overload = false;
			for (final Method method : methods) {
				if (set.contains(method.getName())) {
					overload = true;
					break;
				}
				set.add(method.getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

}

class Add {
	public void add(final int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			System.out.print(a[i]);
			if (!(i == a.length - 1)) {
				System.out.print("+");
			}
		}

		System.out.print("=" + sum);
		System.out.println();
	}
}
