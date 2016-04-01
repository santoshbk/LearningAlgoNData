package santosh.algorithms.sorting.insertion;

public class TestInsertion {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		String k = "Old Val";
		System.out.println("------");
		System.out.println(k);

		checkPrimitive(k);
		System.out.println(k);

		Test t = new Test();
		t.setA(22);
		t.setB("asas");
		System.out.println("Before " + t);
		checkNonPrimitive(t);
		System.out.println("After " + t);

		
		MySingleton c = MySingleton.getInstance(10);
		System.out.println("C" + c.getI());
		MySingleton d = c.clone();
		System.out.println("D" + d.getI());
	}
	
	static void testingInsertionSortOnArray(){
		int[] arr = { 12, 56, 67, 43, 1, 45, 32, 54, 67, 87, 34, 23 };
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		sortArray(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	static void checkNonPrimitive(Test t) {
		t.setA(23);
		t.setB("nothing");
		System.out.println("Inside " + t);
	}

	static void checkPrimitive(String i) {
		System.out.println("inside");
		System.out.println(i);
		i = "new val";
		System.out.println(i);
	}

	static void sortArray(int[] arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

}

class Test {
	private int a;
	private String b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A:" + a + " B:" + b;
	}
}

class MySingleton {

	private int i;

	private MySingleton(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

	private static MySingleton instance;

	public static MySingleton getInstance(int i) {
		if (null == instance)
			instance = new MySingleton(i);
		return instance;
	}

	@Override
	protected MySingleton clone() throws CloneNotSupportedException {
		return instance;
	}

}
