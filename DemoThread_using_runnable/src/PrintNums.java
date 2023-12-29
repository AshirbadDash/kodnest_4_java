

public class PrintNums implements Runnable{
	 public void run() {
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
