package santosh.algorithms.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(getFactorial(BigInteger.valueOf(n)));
    }

    static BigInteger getFactorial(BigInteger K) {
        if (K.intValue() <= 0) return BigInteger.ZERO;
        BigInteger one = BigInteger.ONE;
        BigInteger res = K;
        if (K.intValue() == 1) return one;
        if (K.intValue() >= 2) {
            K = K.subtract(one);
            res = res.multiply(getFactorial(K));
        }
        return res;
    }
}