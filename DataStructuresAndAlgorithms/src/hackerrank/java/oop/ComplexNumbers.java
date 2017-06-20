package hackerrank.java.oop;

import java.util.Scanner;

public class ComplexNumbers {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		double[] re = new double[2], im = new double[2];
		for (int i = 0; i < 2; ++i) {
			re[i] = in.nextDouble();
			im[i] = in.nextDouble();
		}
		Complex x = new Complex(re[0], im[0]), y = new Complex(re[1], im[1]);
		System.out.println(x.add(y));
		System.out.println(x.subtract(y));
		System.out.println(x.multiply(y));
		System.out.println(x.divide(y));
		// System.out.println(x.mod());
		// System.out.println(y.mod());
	}

}

class Complex {
	private double re, im;

	public Complex(final double re, final double im) {
		this.re = re;
		this.im = im;
	}

	public Complex add(final Complex y) {
		return new Complex(re + y.re, im + y.im);
	}

	public Complex subtract(final Complex y) {
		return new Complex(re - y.re, im - y.im);
	}

	public Complex multiply(final Complex y) {
		return new Complex(re * y.re - im * y.im, re * y.im + im * y.re);
	}

	public Complex divide(final Complex y) {
		Complex y2 = new Complex(y.re, -y.im);
		Complex numer = multiply(y2);
		Complex denom = y.multiply(y2);
		return new Complex(numer.re / denom.re, numer.im / denom.re);
	}

	public Complex mod() {
		return new Complex(Math.sqrt(re * re + im * im), 0);
	}

	@Override
	public String toString() {
		return String.format("%.2f%s%.2fi", re, im >= 0 ? "+" : "-", im);
	}
}
