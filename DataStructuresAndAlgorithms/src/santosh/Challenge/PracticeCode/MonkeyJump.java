package santosh.Challenge.PracticeCode;

import java.io.IOException;
import java.util.Scanner;

public class MonkeyJump {

    public static void main(final String[] args) throws IOException {
        final Scanner in = new Scanner(System.in);
        int output = 0;
        final int ip1 = Integer.parseInt(in.nextLine().trim());
        final int ip2 = Integer.parseInt(in.nextLine().trim());
        int ip3_size = 0;
        ip3_size = Integer.parseInt(in.nextLine().trim());
        final int[] ip3 = new int[ip3_size];
        int ip3_item;
        for (int ip3_i = 0; ip3_i < ip3_size; ip3_i++) {
            ip3_item = Integer.parseInt(in.nextLine().trim());
            ip3[ip3_i] = ip3_item;
        }
        output = GetJumpCount(ip1, ip2, ip3);
        System.out.println(String.valueOf(output));
    }

    public static int GetJumpCount(final int input1, final int input2, final int[] input3) {
        int j = 0;
        for (final int i : input3) {
            if (i <= input1) {
                j++;
                continue;
            } else {
                int temp = 0;
                while (i > input1) {
                    temp += input1;
                    if (i <= temp) {
                        j++;
                        break;
                    } else {
                        j++;
                        temp -= input2;
                    }
                }
            }
        }

        return j;
    }

}
