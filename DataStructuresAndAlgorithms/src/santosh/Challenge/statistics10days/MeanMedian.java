package santosh.Challenge.statistics10days;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MeanMedian {

    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	int[] array = new int[N];
	for (int i = 0; i < N; i++) {
	    array[i] = in.nextInt();
	}
	in.close();
	Arrays.sort(array);
	double median = 0;
	if ((N % 2) == 0) {
	    median = (array[N / 2] + array[(N / 2) - 1]) / 2.0;
	} else {
	    median = array[(N / 2) + 1];
	}
	long sum = 0;
	Map<Integer, Integer> map = new HashMap<>();
	for (int i : array) {
	    sum += i;
	    if (map.containsKey(i)) {
		map.put(i, map.get(i) + 1);
	    } else {
		map.put(i, 1);
	    }
	}
	double mean = (sum * 1.0) / N;
	int modeValue = 0;
	int mode = 0;
	for (int i : map.keySet()) {
	    int val = map.get(i);
	    if (val == modeValue) {
		if (mode > i) {
		    mode = i;
		}
	    } else if (val > modeValue) {
		modeValue = val;
		mode = i;
	    }
	}
	System.out.println(mean);
	System.out.println(median);
	System.out.println(mode);
    }

}
