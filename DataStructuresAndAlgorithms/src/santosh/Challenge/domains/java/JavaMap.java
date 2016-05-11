package santosh.Challenge.domains.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by kumbar on 5/7/2016.
 */
public class JavaMap {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		Map<String, Integer> m = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine().trim();
			int phone = in.nextInt();
			m.put(name, phone);
			in.nextLine();
		}
		while (in.hasNext()) {
			String s = in.nextLine().trim();
			if(m.containsKey(s)){
				System.out.println(s+"="+m.get(s));
			} else {
				System.out.println("Not found");
			}
		}
	}
}
