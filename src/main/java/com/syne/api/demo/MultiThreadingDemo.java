package com.syne.api.demo;

public class MultiThreadingDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			MyRunnableThread myRunnable =  new MyRunnableThread(i);
			Thread thread = new Thread(myRunnable);
			thread.start();
			MyThreadApp myThreadApp = new MyThreadApp(i);
			myThreadApp.start();
		}
	}
}

class MyThreadApp extends Thread {
	
	int count;
	
	public MyThreadApp(int i) {
		this.count = i;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("Runnable " + count + " Going into wait block of runnable's run...!!!");
			Thread.sleep(60000, 10);
			System.out.println("Runnable " + count + " Coming out of wait block...!!!");
		} catch (InterruptedException e) {
			e.printStackTrace(); 
		}
	}
}

class MyRunnableThread implements Runnable {
	
	int count;
	
	public MyRunnableThread(int i) {
		this.count = i;
	}

	@Override
	public void run() {
		try {
			System.out.println("Thread " + count + " Going into wait block of thread's run...!!!");
			Thread.sleep(60000, 10);
			System.out.println("Thread " + count + " Coming out of wait block...!!!");
		} catch (InterruptedException e) {
			e.printStackTrace(); 
		}
	}
	
}
