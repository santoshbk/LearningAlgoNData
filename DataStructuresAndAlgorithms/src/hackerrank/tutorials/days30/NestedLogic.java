package hackerrank.tutorials.days30;

import java.util.Calendar;
import java.util.Scanner;

public class NestedLogic {
    public static void main(final String[] args) {
	Scanner in = new Scanner(System.in);
	int dAct = in.nextInt();
	int mAct = in.nextInt();
	int yAct = in.nextInt();
	int dDue = in.nextInt();
	int mDue = in.nextInt();
	int yDue = in.nextInt();
	in.close();
	Calendar cAct = Calendar.getInstance();
	cAct.set(yAct, mAct, dAct);
	Calendar cDue = Calendar.getInstance();
	cDue.set(yDue, mDue, dDue);
	if (!cAct.after(cDue)) {
	    System.out.println(0);
	} else {
	    int y = yAct - yDue;
	    int m = mAct - mDue;
	    int d = dAct - dDue;
	    if (y == 0) {
		if (m == 0) {
		    System.out.println(15 * d);
		} else {
		    System.out.println(500 * m);
		}
	    } else {
		System.out.println(10000);
	    }
	}
    }

}
