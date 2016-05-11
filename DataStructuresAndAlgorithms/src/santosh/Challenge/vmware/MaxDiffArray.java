package santosh.Challenge.vmware;

/**
 * Created by kumbar on 5/7/2016.
 */
public class MaxDiffArray {

	public static void main(String[] args) {
		int[] arr = {7,9,5,6,3,2};
		System.out.println(maxDifference(arr));
	}

	static int maxDifference(int[] a) {
		int maxVal = a[0];
		int maxIndex=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>maxVal){
				maxVal = a[i];
				maxIndex = i;
			}
		}
		int minVal = a[0];
		int minIndex = 0;
		for (int i = 0; i <=maxIndex; i++) {
			if(a[i]<minVal){
				minVal = a[i];
				minIndex = i;
			}
		}
		
		return a[maxIndex]-a[minIndex];
	}
}
