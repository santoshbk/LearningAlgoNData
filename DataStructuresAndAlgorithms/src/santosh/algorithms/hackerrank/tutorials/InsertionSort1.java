package santosh.algorithms.hackerrank.tutorials;

import java.util.Scanner;

public class InsertionSort1 {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
	
	public static void insertIntoSorted(int[] ar) {
        int len = ar.length;
        int index = len-1;
		int e = ar[index];
        for (int i = 0; i < len; i++) {
			int a = ar[i];
			
		}
    }
	
	private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }  
        System.out.println("");
    }

}
