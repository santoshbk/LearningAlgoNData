package santosh.Challenge.domains.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
    private final int id;
    private final String fname;
    private final double cgpa;

    public Student(final int id, final String fname, final double cgpa) {
	super();
	this.id = id;
	this.fname = fname;
	this.cgpa = cgpa;
    }

    public int getId() {
	return this.id;
    }

    public String getFname() {
	return this.fname;
    }

    public double getCgpa() {
	return this.cgpa;
    }
}

class MyComparator implements Comparator<Student> {

    @Override
    public int compare(final Student o1, final Student o2) {
	int i = 0;
	int compare = Double.compare(o1.getCgpa(), o2.getCgpa());
	if (compare == 0) {
	    compare = o1.getFname().compareTo(o2.getFname());
	    if (compare == 0) {
		i = -(Integer.compare(o1.getId(), o2.getId()));
	    } else {
		i = compare;
	    }
	} else {
	    i = -compare;
	}
	return i;
    }

}

// Complete the code
public class JavaSort {
    public static void main(final String[] args) {
	final Scanner in = new Scanner(System.in);
	int testCases = Integer.parseInt(in.nextLine());

	final List<Student> studentList = new ArrayList<>();
	while (testCases > 0) {
	    final int id = in.nextInt();
	    final String fname = in.next();
	    final double cgpa = in.nextDouble();

	    final Student st = new Student(id, fname, cgpa);
	    studentList.add(st);

	    testCases--;
	}
	in.close();
	Collections.sort(studentList, new MyComparator());
	for (final Student st : studentList) {
	    System.out.println(st.getFname() + " " + st.getCgpa() + " " + st.getId());
	}
    }

}
