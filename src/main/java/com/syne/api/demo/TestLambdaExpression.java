package com.syne.api.demo;

public class TestLambdaExpression {
	public static void main(String[] args) {
		
		TestLambdaExpression testLambdaExpression = new TestLambdaExpression();
		
		MathOperation square = (num1) -> num1 * num1;
		MathOperation squareRoot = (int num1) -> {return num1/10;};
		
		System.out.println("Square = " + testLambdaExpression.calculate(100, square));
		System.out.println("SquareRoot = " + testLambdaExpression.calculate(100, squareRoot));
	}
	
	private int calculate(int num1, MathOperation mathOperation) {
		System.out.println("Actual number = " + num1);
		return mathOperation.calculation(num1);
	}
	
//	interface MathOperation {
//		int calculation(int num1);
//	}
}
