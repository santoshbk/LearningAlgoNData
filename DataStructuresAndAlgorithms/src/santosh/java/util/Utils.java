package santosh.java.util;

import java.util.Scanner;

public class Utils {

    private static Scanner scanner = new Scanner(System.in);;

    public static Scanner getScanner() {
	return scanner;
    }

    public static void closeScanner(final Scanner in) {
	in.close();
    }

}
