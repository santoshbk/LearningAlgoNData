package santosh.java.util;

public class Common {

    public static double getMedian(final int[] array) {
	double median = 0;
	int length = array.length;
	if ((length % 2) == 0) {
	    median = (array[length / 2] + array[(length / 2) - 1]) / 2.0;
	} else {
	    median = array[length / 2];
	}
	return median;
    }
}
