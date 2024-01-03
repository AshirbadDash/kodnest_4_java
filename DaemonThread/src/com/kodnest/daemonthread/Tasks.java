//package com.kodnest.daemonthread;
//
//public class Tasks extends Thread{
//
//	Tasks(String name) {
//		super(name);
//
//	}
//
//	public void typing() {
//
//		for (int i = 0; i <= 10; i++) {
//			System.out.println("typing....");
//			try {
//				Thread.sleep(2000);
//
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//
//		}
//	}
//
//	void autoCorrection() {
//		for (;;) {
//			System.out.println("Auto-Correction");
//
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	public void autoSuggestion() {
//		for (;;) {
//			System.out.println("Auto-Suggestion");
//			try {
//				Thread.sleep(2000);
//
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//
//			}
//		}
//	}
//
//	public void run() {
//		if (this.getName().equalsIgnoreCase("typing")) {
//			typing();
//		} else if (this.getName().equalsIgnoreCase("autoCorrection")) {
//			autoCorrection();
//		} else if (this.getName().equalsIgnoreCase("autoSuggestion")) {
//			autoSuggestion();
//		}
//	}
//
//
//}
