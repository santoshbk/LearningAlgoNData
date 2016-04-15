package santosh.Challenge.PracticeCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MonkAndPowerOfTime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] ideal = new int[N];
		Deque<Integer> deque = new ArrayDeque<>(N);
		for (int i = 0; i < N; i++) {
			deque.addLast(in.nextInt());
		}
		for (int i = 0; i < N; i++) {
			ideal[i] = in.nextInt();
		}
		int i = 0;
		int steps = 0;
		while(!deque.isEmpty()){
			int k = deque.getFirst();
			if(ideal[i]==k){
				steps++;
				deque.pollFirst();
				i++;
			} else {
				steps++;
				int no = deque.pollFirst();
				deque.addLast(no);
			}
		}
		System.out.println(steps);
	}
}
