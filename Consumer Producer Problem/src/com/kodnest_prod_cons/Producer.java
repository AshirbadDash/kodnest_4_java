package com.kodnest_prod_cons;

public class Producer implements Runnable {
	Factory f;

	Producer(Factory f) {
		this.f = f;

	}

	@Override
	public void run() {
		int i=0;
		while (true){
			f.produce(i++);

		}
	}

}
