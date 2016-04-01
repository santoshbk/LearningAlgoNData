package santosh.Challenge.fidelity;

public class DarkNBright {

	
	public static void main(String[] args) {
		String[] a = new String[5];
		a[0] = "1 0 0 1";
		a[1] = "0 0 0 1";
		a[2] = "0 0 0 1";
		a[3] = "0 0 0 1";
		a[4] = "1 0 0 1";
		max_dark(a);
	}
	
	static String max_dark(String[] arr) {
		int N = arr.length;
		int M = 0;
		for (char c: arr[0].toCharArray()) {
			if(c!=' ')
				M++;
		}
		int[][] a = new int[N][M];
		for (int i = 0; i < arr.length; i++) {
			int j = 0;
			for (char c: arr[i].toCharArray()) {
				if(c!=' ') a[i][j++]=Integer.valueOf(""+c);
			}
		}
		for (int i = 0; i < N; i++) {
			
		}
		System.out.println(arr[0]);
		return "";
    }
}
