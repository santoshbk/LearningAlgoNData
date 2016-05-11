package santosh.Challenge.domains.java;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by kumbar on 5/7/2016.
 */
public class JavaBigDecimal {
	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		System.out.println("------");
		Arrays.sort(s, new Comparator<String>() {
			public int compare(String o1, String o2) {
				BigDecimal b1 = new BigDecimal(o1.trim());
				BigDecimal b2 = new BigDecimal(o2.trim());
				return b1.compareTo(b2);
			};
		});

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}
