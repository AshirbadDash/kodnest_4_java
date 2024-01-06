
public class Demo {
	public static void main(String[] args) {
		Soln sol = new Soln();

		sol.start();
		for (int i = 50; i < 60; i++) {
			System.out.println("Parent Thread");
			Thread.currentThread().yield();

		}

	}

}
