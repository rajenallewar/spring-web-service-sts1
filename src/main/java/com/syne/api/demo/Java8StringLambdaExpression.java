package com.syne.api.demo;

public class Java8StringLambdaExpression {
	
	public static void main(String[] args) {
		Java8StringLambdaExpression lambdaExpr = new Java8StringLambdaExpression();
		Greetings greetings = (message) -> System.out.println("Hi " + message);
		lambdaExpr.sayHi("SSS", greetings);
	}
	
	void sayHi(String message,Greetings greetings) {
		greetings.sayHello(message);
	}

	interface Greetings {
		void sayHello(String message);
		//void sayHi(String msg);  /// If we uncomment this this wont work as it fail to become functional interface..
		//Lambda expression Only work for functional interface
	}
}
