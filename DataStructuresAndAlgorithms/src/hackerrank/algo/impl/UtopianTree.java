package hackerrank.algo.impl;

import java.util.Scanner;

/**
 * Created by kumbar on 5/6/2016.
 */
public class UtopianTree {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int H = 1;
        	int n = in.nextInt();
        	if(n<=0){
        		System.out.println(1);
        		continue;
        	}
            for (int i = 1; i <= n; i++) {
				if(i%2!=0){
					H*=2;
				} else {
					H++;
				}
			}
            System.out.println(H);
        }
    }

}
