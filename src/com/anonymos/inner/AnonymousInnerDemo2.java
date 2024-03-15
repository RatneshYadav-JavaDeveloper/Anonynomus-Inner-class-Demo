package com.anonymos.inner;

public class AnonymousInnerDemo2 {

	public static void main(String[] args) {
		
		/**
		 * 
		 * Java Anonymous inner class can be created in two ways:
		 * 1. Class (may be abstract or concrete).
		 * 2. Interface
		 **/
		Runnable r = new Runnable() {
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("CHILD-THREAD");
				}
			}
		};
		
		Thread t = new Thread(r);
		t.start();

	}

}
