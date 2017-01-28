package hackerrank.java.ds;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JavaPriorityQueue {
	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int totalEvents = in.nextInt();
		in.nextLine();
		MyStudentComparator cc = new MyStudentComparator();
		PriorityQueue<Student1> queue = new PriorityQueue<>(cc);
		while (totalEvents > 0) {
			String event = in.next();

			if ("ENTER".equals(event)) {
				String fname = in.next();
				double cgpa = in.nextDouble();
				int token = in.nextInt();
				Student1 s = new Student1(token, fname, cgpa);
				queue.add(s);
			} else if ("SERVED".equals(event)) {
				queue.poll();
			}
			// Complete your code
			queue.forEach(s -> System.out.print(s.getFname() + " "));
			System.out.println();
			totalEvents--;
			in.nextLine();
		}
		queue.forEach(s -> printStudent(s));

	}

	private static void printStudent(final Student1 s) {
		System.out.println(s.getFname() + " " + s.getCgpa() + " " + s.getToken());
	}
}

class MyStudentComparator implements Comparator<Student1> {

	@Override
	public int compare(final Student1 o1, final Student1 o2) {
		int compare = Double.compare(o2.getCgpa(), o1.getCgpa());
		if (compare == 0) {
			compare = o1.getFname().compareTo(o2.getFname());
			if (compare == 0) {
				return Integer.compare(o1.getToken(), o2.getToken());
			} else {
				return compare;
			}
		} else {
			return compare;
		}

	}

}

class Student1 {
	private final int token;
	private final String fname;
	private final double cgpa;

	public Student1(final int id, final String fname, final double cgpa) {
		super();
		this.token = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getToken() {
		return this.token;
	}

	public String getFname() {
		return this.fname;
	}

	public double getCgpa() {
		return this.cgpa;
	}
}