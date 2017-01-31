import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double payment = scanner.nextDouble();
        scanner.close();
        Locale.setDefault(new Locale("en", "IN"));
        final String india = NumberFormat.getCurrencyInstance().format(payment);
        final String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        final String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        final String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
