package hackerrank.java.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by kumbar on 5/7/2016.
 */
public class JavaBigInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		BigInteger i = new BigInteger(s1);
		BigInteger j = new BigInteger(s2);
		System.out.println(i.add(j));
		System.out.println(i.multiply(j));
	}

}
