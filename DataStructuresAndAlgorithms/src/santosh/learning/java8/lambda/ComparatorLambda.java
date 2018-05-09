package santosh.learning.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

	public static void main(final String[] args) {

		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(final String o1, final String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		};

		Comparator<String> compLambda = (final String o1, final String o2) -> Integer.compare(o1.length(), o2.length());

		List<String> list = Arrays.asList("**", "*****", "**77", "*");
		ComparatorLambda cl = new ComparatorLambda();
		cl.printList(list);
		list.sort(comp);
		System.out.println("-------");
		cl.printList(list);
		List<String> list1 = Arrays.asList("*$", "*%%**", "*&*&*77", "*");
		System.out.println("-------");
		cl.printList(list1);
		list1.sort(compLambda);
		cl.printList(list1);

	}

	private void printList(final List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

}
