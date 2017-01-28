package hackerearth.challenges.JanCir17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GoodString {

	public static void main(final String args[]) throws Exception {

		// * Read input from stdin and provide input before running
		// * Use either of these methods for input

		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		// int N = Integer.parseInt(line);

		/*
		 * // Scanner Scanner s = new Scanner(System.in); int n = s.nextInt();
		 */
		List<Character> list = new ArrayList<>();
		int count = 0;
		for (Character character : line.toCharArray()) {
			if (!list.contains(character)) {
				list.add(character);
			} else {
				count++;
			}
		}
		System.out.println(count);
	}

}
