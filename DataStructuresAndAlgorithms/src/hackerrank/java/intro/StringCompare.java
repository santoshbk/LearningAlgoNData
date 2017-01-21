package hackerrank.java.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by kumbar on 5/5/2016.
 */
public class StringCompare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int n = sc.nextInt();
        usingTreeSet(a,n);
        System.out.println("''''''''''");
        withoutTreeSet(a, n);
		sc.close();
	}

    private static void usingTreeSet(String a, int n){
    	SortedSet<String> set = new TreeSet<>();
        for (int i = 0; (i+n) <= a.length(); i++) {
            set.add(a.substring(i,n+i));
        }
        System.out.println(set.first());
        System.out.println(set.last());
    }
    
    private static void withoutTreeSet(String a, int n){
    	int k = a.length()-n+1;
    	String[] arr = new String[k];
    	for (int i = 0; i<k; i++) {
            arr[i] = a.substring(i,n+i);
        }
    	Arrays.sort(arr);
    	System.out.println(arr[0]);
        System.out.println(arr[k-1]);
    }

}
