package hackerrank.tutorials.days30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by kumbar on 5/9/2016.
 */
public class DictinariesMaps {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> m = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			m.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			if (m.containsKey(s)) {
				System.out.println(s + "=" + m.get(s));
			} else {
				System.out.println("Not found");
			}
		}
		in.close();
	}
}
