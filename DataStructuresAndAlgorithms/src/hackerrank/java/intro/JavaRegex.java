package hackerrank.java.intro;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by kumbar on 5/7/2016.
 */
class myRegex {
	String pattern = "[\\d]re{1,3}[.][\\d][\\d][\\d]";
}

public class JavaRegex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			String IP = in.next();
			System.out.println(IP.matches(new myRegex().pattern));

	}
}