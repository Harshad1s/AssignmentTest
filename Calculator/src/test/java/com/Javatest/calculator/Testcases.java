package com.Javatest.calculator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Testcases {
	@Test
	public void t_01_test_add() {
		
		//Step 1: Define Expected values
		int expected = 111111;
		
		//Step 2: Perform Operations
		Addition add = new Addition(-234234,345345);
	
		//Step 3: Get Actual Value
		int actual = add.performOperation();
		
		//Step 4: Validation/Checkpoint/Assertion
		assertEquals(expected, actual);
		
		/*
		if (actual==expected) {
			//Test Case is Passed
			System.out.println("Test case is passed. Expected and Actual matched.");
		}else {
			//Test case is fail
			System.out.println("Test case is Failed. Exected value is: " + expected + " actual value is:" + actual);
			Assert.fail("Test case is Failed. Exected value is: " + expected + " actual value is:" + actual);
		}	*/
		
	}
	
	@Test
	public void t_02_test_substration() {
		int num1 = 234823;
		int num2 = -23094823;
		
		//Expected
		int expected = 23329646;
		
		//Steps to be done
		 Substration sub = new Substration(num1,num2);
		int actual = sub.performOperation();
	
		//Validation
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void t_03_test_multiplication() {
		int num1 = 423;
		int num2 = 525;
		
		//Expected
		int expected = 222075;
		
		//Steps to be done
		Multiplication mul = new Multiplication(num1,num2);
		int actual = mul.performOperation();
	
		//Validation
		assertEquals(expected, actual);
	}
	
	@Test
	public void t_04_test_division() {
		int num1 = 4000;
		int num2 = 200;
		
		//Expected
		float expected = 20;
		
		//Steps to be done
		 Division div = new Division(num1,num2);
		float actual = div.performOperation();
	
		//Validation
		assertEquals(expected, actual);
	}
}
