package santosh.Challenge.days30;

import java.util.Scanner;

/**
 * Created by kumbar on 5/6/2016.
 */
public class Loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        for (int i = 1; i <= 10; i++) {
			System.out.println(N+" x "+i+" = "+ N*i);
		}
        
    }
    
}
