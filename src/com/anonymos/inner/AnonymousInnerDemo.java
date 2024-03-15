package com.anonymos.inner;

/**
 * Here, i used old way to implement Runnable interface.
 * 
 * please check AnonymousInnerDemo2.java for implement Runnable
 * anonymous inner class.
 * **/
class myRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("CHILD-THREAD");
		}

	}

}

public class AnonymousInnerDemo {

	public static void main(String[] args) {
		
		myRunnable m = new myRunnable();
		Thread t = new Thread(m);
		t.start();
		
	}
}
