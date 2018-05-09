package santosh.java.util;

public class Common {

	public static double getMedian(final int[] array) {
		double median = 0;
		int length = array.length;
		if (length % 2 == 0) {
			median = (array[length / 2] + array[length / 2 - 1]) / 2.0;
		} else {
			median = array[length / 2];
		}
		return median;
	}

	public static int gcd(final int n1, final int n2) {
		int gcd = 1;
		for (int i = 1; i <= n1 && i <= n2; ++i) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
}
