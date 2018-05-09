package santosh.learning.java8.lambda;

public class RunnableLambda {

	public static void main(final String[] args) throws Exception {
		Runnable run = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Hello from Thread [" + Thread.currentThread().getName() + "]");
				}
			}
		};

		Runnable run1 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello from Thread [" + Thread.currentThread().getName() + "]");
			}
		};
		Thread t = new Thread(run1);
		t.setName("t > t");
		t.start();
		// t.join();
		Thread t1 = new Thread(run);
		t1.setName("t1 > t1");
		t1.start();
		t1.join();
	}

}
