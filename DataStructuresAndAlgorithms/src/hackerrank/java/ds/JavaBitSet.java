package hackerrank.java.ds;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

	public static void main(final String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		BitSet b1 = new BitSet(n);
		BitSet b2 = new BitSet(n);

		while (m-- > 0) {
			String s = in.next();
			int x = in.nextInt();
			int y = in.nextInt();
			switch (s) {
			case "AND":
				if (x == 1) {
					if (y == 1) {
						b1.and(b1);
					} else {
						b1.and(b2);
					}
				} else {
					if (y == 1) {
						b2.and(b1);
					} else {
						b2.and(b2);
					}
				}
				System.out.println(b1.cardinality() + " " + b2.cardinality());
				break;
			case "OR":
				if (x == 1) {
					if (y == 1) {
						b1.or(b1);
					} else {
						b1.or(b2);
					}
				} else {
					if (y == 1) {
						b2.or(b1);
					} else {
						b2.or(b2);
					}
				}
				System.out.println(b1.cardinality() + " " + b2.cardinality());
				break;
			case "XOR":
				if (x == 1) {
					if (y == 1) {
						b1.xor(b1);
					} else {
						b1.xor(b2);
					}
				} else {
					if (y == 1) {
						b2.xor(b1);
					} else {
						b2.xor(b2);
					}
				}
				System.out.println(b1.cardinality() + " " + b2.cardinality());
				break;
			case "FLIP":
				if (x == 1) {
					b1.flip(y);
				} else {
					b2.flip(y);
				}
				System.out.println(b1.cardinality() + " " + b2.cardinality());
				break;
			case "SET":
				if (x == 1) {
					b1.set(y);
				} else {
					b2.set(y);
				}
				System.out.println(b1.cardinality() + " " + b2.cardinality());
				break;
			default:
				break;
			}
		}

	}

}
