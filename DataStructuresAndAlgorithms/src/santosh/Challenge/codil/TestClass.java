package santosh.Challenge.codil;

public class TestClass {

	public static void main(String[] args) {
		TestClass t = new TestClass();
		int[] A = { 1, 1, 2, 2, 3 };
		int K = 3;
		System.out.println(t.givenSolution(A, K));
	}

	public boolean solution(int[] A, int K) {
		int n = A.length;
		for (int i = 0; i < n - 1; i++) {
			if (A[i] == K)
				return true;
		}
		return false;
	}

	public boolean givenSolution(int[] A, int K) {
		int n = A.length;
		for (int i = 0; i < n - 1; i++) {
			if (A[i] + 1 < A[i + 1])
				return false;
		}
		if (A[0] != 1 && A[n - 1] != K)
			return false;
		else
			return true;
	}

}
