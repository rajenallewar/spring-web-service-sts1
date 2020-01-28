package com.syne.api.demo;

public class TestRunMethod {
	
	public static void main(String[] args) {
		
		 Thread newThread = new Thread(new MyRunnableThread1());
		 System.out.println("Start");
		 newThread.start();  //should be start();
		 System.out.println("End.. Total Threads :: " + Thread.activeCount()); // 2 threads get created --> main and newThread
		 System.out.println(newThread.getName());
		 System.out.println(newThread.currentThread().getName());
		 
//		 Thread newThread1 = new Thread(new  MyRunnableThread1()); 
//		 System.out.println("Start"); newThread1.run(); //should be start(); Calling direct run method will not create new thread
//		 System.out.println("End.. Total Threads :: " + Thread.activeCount()); // only 1 thread running --> main thread
//		 
//		 System.out.println("Start"); 
//		 new MyRunnableThread1().run(); //should be start(); Calling direct run method will not create new thread 
//		 System.out.println("End.. Total Threads :: " + Thread.activeCount()); // only 1 thread running --> main thread
		 
		 
//		 ThreadExtendClass extendedClass = new ThreadExtendClass();
//		 extendedClass.run(); //should be start(); Calling direct run method will not create new thread
//		 System.out.println("End.. Total Threads :: " + Thread.activeCount());
//		 System.out.println(extendedClass.getName());
	}
	
}
