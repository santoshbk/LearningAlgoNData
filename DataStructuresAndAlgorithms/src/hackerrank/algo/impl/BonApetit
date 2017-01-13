package hackerrank.algo.impl;

import java.util.Scanner;

public class BonApetit {

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        final int k = in.nextInt();
        final int[] i = new int[n];
        for (int j = 0; j < n; j++) {
            i[j] = in.nextInt();
        }
        final int bc = in.nextInt();
        in.close();
        long sum = 0;
        for (int j = 0; j < n; j++) {
            if (j != k) {
                sum += i[j];
            }
        }
        final long ba = sum / 2;
        if (ba == bc) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(bc - ba);
        }
    }

}
