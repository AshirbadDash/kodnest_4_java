
public class Main {
	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);
		PrintAlpha printAlpha = new PrintAlpha();
		PrintNums printNums = new PrintNums();
		Thread thread1 = new Thread(printAlpha);
		Thread thread2 = new Thread(printNums);

		thread1.start();
		thread2.start();

	}

}
