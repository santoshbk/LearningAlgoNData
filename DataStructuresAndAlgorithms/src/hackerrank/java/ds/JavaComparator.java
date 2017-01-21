package hackerrank.java.ds;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaComparator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Player[] player = new Player[n];
		Checker check = new Checker();

		for (int i = 0; i < n; i++) {
			player[i] = new Player(sc.next(), sc.nextInt());
		}
		sc.close();

		Arrays.sort(player, check);

		for (int i = 0; i < n; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}

	}

}

class Player {
	String name;
	int score;

	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Checker implements Comparator<Player> {
	@Override
	public int compare(Player o1, Player o2) {
		if (o1.score > o2.score) {
			return 1;
		} else if (o1.score < o2.score) {
			return -1;
		} else {
			return o1.name.compareToIgnoreCase(o2.name);
		}

	}
}
