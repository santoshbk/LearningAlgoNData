package santosh.Challenge.days30;

import java.util.Scanner;

/**
 * Created by kumbar on 5/9/2016.
 */
public class Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        for(int i=n-1; i >= 0; i++){
            System.out.println(arr[i]);
        }
        
    }
}
