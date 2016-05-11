package santosh.Challenge.days30;

import java.util.Scanner;

/**
 * Created by kumbar on 5/4/2016.
 */
public class ConditionalStatement {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        //scan.close();
        String ans="";
        for (int i=1;i<=100;i++){
            int n = i;
            if(n%2==1){
                ans = "Weird";
            }
            else{
                if(2<=n && n<=5){
                    ans = "Not Weird";
                } if(6<=n && n<=20){
                    ans = "Weird";
                } if(n>20){
                    ans = "Not Weird";
                }
            }
            System.out.println(i+":"+ans);
        }
        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)

        System.out.println(ans);
    }
}
