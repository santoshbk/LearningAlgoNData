package com;

import java.io.IOException;
import java.util.Scanner;

public class Sol {

	static String winner(final int[] andrea, final int[] maria, final String s) {
		int sumA = 0;
		int sumM = 0;
		int len = andrea.length;
		int i;
		if (s.equals("Odd")) {
			i = 1;
		} else {
			i = 0;
		}
		for (; i < len; i += 2) {
			int dif = andrea[i] - maria[i];
			sumA += dif;
			sumM -= dif;
		}

		if (sumA < sumM) {
			return "Maria";
		} else if (sumM < sumA) {
			return "Andrea";
		} else {
			return "Tie";
		}
	}

	public static void main(final String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		// final String fileName = System.getenv("OUTPUT_PATH");
		// BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		// String res;

		int _andrea_size = 0;
		_andrea_size = Integer.parseInt(in.nextLine().trim());
		int[] _andrea = new int[_andrea_size];
		int _andrea_item;
		for (int _andrea_i = 0; _andrea_i < _andrea_size; _andrea_i++) {
			_andrea_item = Integer.parseInt(in.nextLine().trim());
			_andrea[_andrea_i] = _andrea_item;
		}

		int _maria_size = 0;
		_maria_size = Integer.parseInt(in.nextLine().trim());
		int[] _maria = new int[_maria_size];
		int _maria_item;
		for (int _maria_i = 0; _maria_i < _maria_size; _maria_i++) {
			_maria_item = Integer.parseInt(in.nextLine().trim());
			_maria[_maria_i] = _maria_item;
		}

		String _s;
		try {
			_s = in.nextLine();
		} catch (Exception e) {
			_s = null;
		}

		// res = winner(_andrea, _maria, _s);
		// bw.write(res);
		// bw.newLine();
		//
		// bw.close();
		System.out.println(winner(_andrea, _maria, _s));
	}

}
