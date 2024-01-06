package com.kodnest_prod_cons;

public class Factory {

	boolean flag = false;
	int num;

	synchronized void produce(int num) {
		try {

			if (!flag) {
				this.num = num;

				System.out.println("Produced Item :" + num);
				flag = true;
				notify();
			} else {
				wait();

			}

		} catch (Exception e) {

			System.out.println(e);
		}
	}

	synchronized void consume() {
		try {
			if (flag) {
//				this.num = num;
				System.out.println("Consumed Item :" + num);
				flag = false;
				notify();
			} else {
				wait();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
