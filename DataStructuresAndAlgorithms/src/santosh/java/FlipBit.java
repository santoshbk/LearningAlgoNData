package a;

import java.io.IOException;
import java.util.Scanner;

public class FlipBit {
    public static void main(final String[] args) throws IOException {
        final Scanner in = new Scanner(System.in);
        int output = 0;
        final String ip1 = in.nextLine().trim();
        final int ip2 = Integer.parseInt(in.nextLine().trim());
        final int ip3 = Integer.parseInt(in.nextLine().trim());
        output = nochange_bits(ip1, ip2, ip3);
        System.out.println(String.valueOf(output));
    }

    public static int nochange_bits(final String input1, final int input2, final int input3) {
        if (input2 < 0 || input3 < 0) {
            return -1;
        }
        final int l = input1.length();
        final Long ip = Long.valueOf(input1);

        return 0;
    }

    private static int compareArrayForBits(final String input1, final String flipped) {
        return 0;
    }

    private static String flip(final String flipped, final int input2) {
        return null;
    }

    public static int nochange_bits1(final String input1, final int input2, final int input3) {
        if (input2 < 0 || input3 < 0) {
            return -1;
        }
        final char[] original = input1.toCharArray();
        char[] flipped = input1.toCharArray();
        flipped = flip(flipped, input2);
        flipped = flip(flipped, input3);
        return compareArrayForBits(original, flipped);
    }

    private static int compareArrayForBits(final char[] original, final char[] flipped) {
        int count = 0;
        for (int i = 0; i < original.length; i++) {
            if (original[i] == flipped[i] && original[i] == '1') {
                count++;
            }
        }
        return count;
    }

    private static char[] flip(final char[] array, final int k) {
        for (int i = 0; i < array.length; i++) {
            if (i < k - 1) {
                continue;
            }
            array[i] = change(array[i]);
        }
        return array;
    }

    private static char change(final char c) {
        if (c == '1') {
            return '0';
        } else {
            return '1';
        }
    }
}
