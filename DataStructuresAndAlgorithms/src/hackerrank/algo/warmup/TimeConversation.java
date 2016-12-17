package hackerrank.algo.warmup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversation {

	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
        String time = in.next();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
        Date d = sdf.parse(time);
        
        System.out.println(sdf1.format(d));
	}

}
