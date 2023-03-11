package com.Javatest.calculator;

public class Multiplication {
	int number1;
	int number2;
	int result;
	
	public Multiplication(int a, int b) {
		number1 = a;
		number2 = b;
	}
	
	public int performOperation() {
		result = number1 * number2;
		return result;
	}

}
