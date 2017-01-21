package hackerrank.java.oop;

import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;

public class CalculatingVolume {
	public static void main(final String[] args) {
		DoNotTerminate.forbidExit();
		try {
			Calculate cal = new Calculate();
			int T = cal.get_int_val();
			while (T-- > 0) {
				double volume = 0.0;
				int ch = cal.get_int_val();
				if (ch == 1) {
					int a = cal.get_int_val();
					volume = Calculate.do_calc().get_volume(a);
				} else if (ch == 2) {
					int l = cal.get_int_val();
					int b = cal.get_int_val();
					int h = cal.get_int_val();
					volume = Calculate.do_calc().get_volume(l, b, h);
				} else if (ch == 3) {
					double r = cal.get_double_val();
					volume = Calculate.do_calc().get_volume(r);
				} else if (ch == 4) {
					double r = cal.get_double_val();
					double h = cal.get_double_val();
					volume = Calculate.do_calc().get_volume(r, h);
				}
				cal.output.display(volume);
			}
		} catch (NumberFormatException e) {
			System.out.print(e);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}

class DoNotTerminate {

	public static class ExitTrappedException extends SecurityException {
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(final Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
}

class Calculate {

	static class Dummy {

		public double get_volume(final double r, final double h) {
			return Math.PI * r * r * h;
		}

		public void display(final double volume) {
			System.out.println(volume);
		}

		public double get_volume(final double r) {
			return 2 * Math.PI * r / 3;
		}

		public double get_volume(final int a) {
			return Math.pow(a, 3);
		}

		public double get_volume(final int l, final int b, final int h) {
			return l * b * h;
		}
	}

	static Dummy output = new Dummy();
	Scanner in = new Scanner(System.in);

	public int get_int_val() throws IOException {
		return this.in.nextInt();
	}

	public static Dummy do_calc() {
		return output;
	}

	public double get_double_val() throws IOException {
		return this.in.nextDouble();
	}

}