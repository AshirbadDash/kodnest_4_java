package com.kodnest_prod_cons;

public class Consumer implements Runnable {
	Factory f;

	Consumer(Factory f) {
		this.f = f;

	}

	@Override
	public void run() {

		while (true) {
			f.consume();
		}
	}

}
