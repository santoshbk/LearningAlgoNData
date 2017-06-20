package techgig.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SmallOnes {
	public static void oldMain() throws NumberFormatException, IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		StringTokenizer st = new StringTokenizer(in.nextLine());
		int[] a = new int[n];
		int i = 0;
		while (st.hasMoreTokens()) {
			a[i++] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		System.out.println(a[0] + a[1]);
	}

	public static void main(final String[] args) throws NumberFormatException, IOException {
		List<Integer> list = Arrays.asList(getArray());
		Collections.sort(list);
		System.out.println(list.get(0) + list.get(1));

	}

	private static Integer[] getArray() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		Integer[] a = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		return a;
	}

}
