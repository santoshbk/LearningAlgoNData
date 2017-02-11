package hackerearth.practice.BasicProg.io;

import java.util.Scanner;

public class MagicalString {

    public static void main(final String[] args) {
	final Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	while (t-- > 0) {
	    final int l = in.nextInt();
	    in.nextLine();
	    final String s = in.nextLine();
	    for (int i = 0; i < l; i++) {
		final int x = s.charAt(i);
		if (isPrime(x)) {
		    final char c = (char) ((isChar(x) ? x : getPrime(x)));
		    System.out.print(c);
		} else {
		    final char c = (char) getPrime(x);
		    System.out.print(c);
		}
	    }
	    System.out.println();
	}
    }

    private static int getPrime(final int x) {
	int max = x + 1;
	int min = x - 1;
	if (x < 65) {
	    while (true) {
		max = getNextPrime(max);
		if (isChar(max)) {
		    break;
		} else {
		    max++;
		}
	    }
	    return max;
	} else if (x > 122) {
	    while (true) {
		min = getPrevPrime(min);
		if (isChar(min)) {
		    break;
		} else {
		    min++;
		}
	    }
	    return min;
	} else {
	    max = getNextPrime(x);
	    min = getPrevPrime(x);
	    final int minD = x - min;
	    final int maxD = max - x;
	    if ((minD - maxD) > 0) {
		return isChar(max) ? max : min;
	    } else {
		return isChar(min) ? min : max;
	    }
	}

    }

    private static int getPrevPrime(final int x) {
	int min = x;
	while (true) {
	    if (isPrime(min)) {
		break;
	    } else {
		min--;
	    }
	}
	return min;
    }

    private static int getNextPrime(final int x) {
	int max = x;
	while (true) {
	    if (isPrime(max)) {
		break;
	    } else {
		max++;
	    }
	}
	return max;
    }

    private static boolean isChar(final int x) {
	if ((x > 64) && (x < 91)) {
	    return true;
	} else if ((x > 96) && (x < 123)) {
	    return true;
	}
	return false;
    }

    private static boolean isPrime(final int x) {
	if (x == 2) {
	    return true;
	}
	if ((x % 2) == 0) {
	    return false;
	}
	for (int i = 3; (i * i) <= x; i += 2) {
	    if ((x % i) == 0) {
		return false;
	    }
	}
	return true;
    }

}
