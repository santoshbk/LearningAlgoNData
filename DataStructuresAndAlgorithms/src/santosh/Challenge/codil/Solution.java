package santosh.Challenge.codil;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

public class Solution {
	public int solution(String S) {
		long l = Long.parseLong(S, 2);
		//int V = Integer.parseInt(S, 2);
		int count = 0;
		for(;l>0;){
			if(l%2==0){
				l /=2;
				count++;
			} else {
				l -=1;
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int a = s.solution("1100");
		System.out.println(a);
	}
}
