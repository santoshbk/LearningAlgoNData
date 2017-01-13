package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SockMerchent {

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        final int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }
        in.close();

        final List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (list.contains(c[i])) {
                count++;
                list.remove(list.indexOf(c[i]));
            } else {
                list.add(c[i]);
            }
        }
        System.out.println(count);
    }

}
