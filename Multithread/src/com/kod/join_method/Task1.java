package com.kod.join_method;

class Task1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
