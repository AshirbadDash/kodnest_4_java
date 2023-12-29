

public class PrintAlpha implements Runnable {
	public void run() {

		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
