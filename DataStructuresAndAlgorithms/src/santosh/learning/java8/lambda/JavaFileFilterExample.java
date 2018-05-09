package santosh.learning.java8.lambda;

import java.io.File;
import java.io.FileFilter;

class JavaFileFilter implements FileFilter {

	@Override
	public boolean accept(final File file) {
		return file.getName().endsWith(".java");
	}

}

public class JavaFileFilterExample {

	static FileFilter anonymousFilter = new FileFilter() {

		@Override
		public boolean accept(final File file) {
			return file.getName().endsWith(".java");
		}
	};

	public static void main(final String[] args) {
		// Concrete class
		JavaFileFilter filter = new JavaFileFilter();
		File dir = new File("d:/WORK/tmp");
		File[] javaFiles = dir.listFiles(filter);
		printLength(javaFiles);

		// Anonymous class
		File[] javaFilesAnonym = dir.listFiles(anonymousFilter);
		printLength(javaFilesAnonym);

		// Lambda expressions
		FileFilter filterLambda = (final File file) -> file.getName().endsWith(".java");
		File[] javaFilesLambda = dir.listFiles(filterLambda);
		printLength(javaFilesLambda);

		File[] javaFilesLambda1 = dir.listFiles((final File file) -> file.getName().endsWith(".java"));
		printLength(javaFilesLambda1);
		printFiles(javaFilesLambda1);
	}

	private static void printLength(final File[] files) {
		System.out.println(files.length);
	}

	private static void printFiles(final File[] files) {
		System.out.println("Printing Files");
		for (File file : files) {
			System.out.println(file);
		}
	}

}
