package santosh.Challenge.days30;

public class Generics {

	public static void main(final String[] args) {
		final Integer[] intArray = { 1, 2, 3, 4, 5 };
		final String[] stringArray = { "Hello", "world" };

		printArray(intArray);
		printArray(stringArray);
	}

	private static <T> void printArray(final T[] object) {
		for (final T t : object) {
			System.out.println(t + " ");
		}
	}

}
