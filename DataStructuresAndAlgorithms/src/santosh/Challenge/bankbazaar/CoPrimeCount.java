package santosh.Challenge.bankbazaar;

public class CoPrimeCount {

	public static void main(String[] args) {
		int[] a = new int[2];
		a[0] = 1;
		a[1] = 3;
		/*int[] res = coprimeCount(a);
		for (int i : res) {
			System.out.println(i);
		}*/
		
		System.out.println(gcd(2,3));
		System.out.println(gcd(16,3));
	}

	static int[] coprimeCount(int[] A) {
		int n = A.length;
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			if (A[i] == 1 || A[i] == 2) {
				b[i] = 1;
				continue;
			}
			int count = 0;
			for (int j = 1; j < A[i]; j++) {
				if(gcd(j,A[i])==1){
					count++;
				}
			}
			b[i]=count;
		}
		return b;

	}

	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
